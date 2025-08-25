package com.example.atlas.domain.repository

import androidx.paging.PagingData
import com.example.atlas.domain.model.Character
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {
    fun charactersPaged(query: String): Flow<PagingData<Character>>
    suspend fun getCharacterById(id: Int): Character
}
