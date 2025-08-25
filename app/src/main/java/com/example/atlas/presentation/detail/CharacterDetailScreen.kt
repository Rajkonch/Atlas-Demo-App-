@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.atlas.presentation.detail

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.example.atlas.presentation.components.*
import androidx.compose.ui.res.stringResource
import com.example.atlas.R

@Composable
fun CharacterDetailScreen(
    id: Int,
    onBack: () -> Unit,
    vm: CharacterDetailViewModel = hiltViewModel()
) {
    when (val s = vm.state) {
        CharacterDetailViewModel.UiState.Loading -> FullScreenLoading()
        is CharacterDetailViewModel.UiState.Error -> FullScreenError(s.msg, onRetry = { onBack() })
        is CharacterDetailViewModel.UiState.Success -> {
            val c = s.c
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text(c.name) },
                        navigationIcon = {
                            IconButton(onClick = onBack) {
                                Icon(Icons.Default.ArrowBack, contentDescription = null)
                            }
                        }
                    )
                }
            ) { p ->
                Column(
                    Modifier
                        .padding(p)
                        .verticalScroll(rememberScrollState())
                        .padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    AsyncImage(
                        model = c.image,
                        contentDescription = c.name,
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(1.6f)
                            .clip(MaterialTheme.shapes.extraLarge)
                    )
                    Text("${c.species} • ${c.gender}", style = MaterialTheme.typography.titleMedium)
                    AssistChip(onClick = {}, label = { Text(c.status) })
                    Text(stringResource(R.string.detail_loaded))
                }
            }
        }
    }
}
