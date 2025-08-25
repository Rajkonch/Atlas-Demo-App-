package com.example.atlas.presentation.detail

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.atlas.domain.model.Character
import com.example.atlas.domain.usecase.GetCharacterById
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class CharacterDetailViewModel @Inject constructor(
    private val getCharacterById: GetCharacterById,
    savedStateHandle: SavedStateHandle
): ViewModel() {
    private val id: Int = requireNotNull(savedStateHandle["id"])
    var state by mutableStateOf<UiState>(UiState.Loading)
        private set

    init {
        viewModelScope.launch {
            runCatching { getCharacterById(id) }
                .onSuccess { state = UiState.Success(it) }
                .onFailure { state = UiState.Error(it.message ?: "Error") }
        }
    }

    sealed interface UiState {
        data object Loading: UiState
        data class Error(val msg: String): UiState
        data class Success(val c: Character): UiState
    }
}
