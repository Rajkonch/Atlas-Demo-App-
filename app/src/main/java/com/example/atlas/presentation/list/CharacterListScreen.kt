@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.atlas.presentation.list

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.res.stringResource
import com.example.atlas.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import coil.compose.AsyncImage
import com.example.atlas.domain.model.Character
import com.example.atlas.presentation.components.*
import com.google.accompanist.swiperefresh.*

@Composable
fun CharacterListScreen(onOpen: (Int) -> Unit, vm: CharacterListViewModel = hiltViewModel()) {
    val q by vm.query.collectAsStateWithLifecycle()
    val items = vm.characters.collectAsLazyPagingItems()

    Column(Modifier.fillMaxSize()) {
        TopAppBar(title = { Text(stringResource(R.string.app_name)) })
        OutlinedTextField(
            value = q,
            onValueChange = vm::onQueryChange,
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
            placeholder = { Text(stringResource(R.string.search_hint)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        SwipeRefresh(
            state = rememberSwipeRefreshState(isRefreshing = items.loadState.refresh is LoadState.Loading),
            onRefresh = { items.refresh() }
        ) {
            LazyColumn(
                contentPadding = PaddingValues(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(count = items.itemCount) { idx ->
                    val c = items[idx]
                    if (c != null) CharacterRow(c, onOpen)
                }

                when (val a = items.loadState.append) {
                    is LoadState.Loading -> item { LoadingRow() }
                    is LoadState.Error -> item { ErrorRow(a.error.message ?: stringResource(R.string.error_generic), onRetry = { items.retry() }) }
                    else -> {}
                }
            }
        }

        when (val s = items.loadState.refresh) {
            is LoadState.Error -> FullScreenError(s.error.message ?: stringResource(R.string.error_generic), onRetry = { items.retry() })
            is LoadState.Loading -> if (items.itemCount == 0) FullScreenLoading()
            else -> {}
        }
    }
}

@Composable
private fun CharacterRow(c: Character, onOpen: (Int) -> Unit) {
    ElevatedCard(
        onClick = { onOpen(c.id) },
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.extraLarge
    ) {
        Row(Modifier.fillMaxWidth().padding(12.dp), verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(
                model = c.image,
                contentDescription = c.name,
                modifier = Modifier.size(72.dp).clip(MaterialTheme.shapes.extraLarge)
            )
            Spacer(Modifier.width(12.dp))
            Column(Modifier.weight(1f)) {
                Text(c.name, style = MaterialTheme.typography.titleMedium)
                Text("${c.species} • ${c.status}", style = MaterialTheme.typography.bodyMedium)
            }
            Icon(Icons.Default.KeyboardArrowRight, contentDescription = null)
        }
    }
}
