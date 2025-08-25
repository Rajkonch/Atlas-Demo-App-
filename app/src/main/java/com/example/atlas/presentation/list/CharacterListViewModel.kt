package com.example.atlas.presentation.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.flatMapLatest
import com.example.atlas.domain.usecase.GetCharactersPaged

@HiltViewModel
class CharacterListViewModel @Inject constructor(
    private val getCharactersPaged: GetCharactersPaged
) : ViewModel() {
    private val _query = MutableStateFlow("")
    val query = _query.asStateFlow()

    val characters = query
        .debounce(300)
        .flatMapLatest { q -> getCharactersPaged(q) }
        .cachedIn(viewModelScope)

    fun onQueryChange(q: String) { _query.value = q }
}
