package com.example.atlas.data.repository

import androidx.paging.*
import com.example.atlas.data.local.db.AppDatabase
import com.example.atlas.data.mapper.toDomain
import com.example.atlas.data.paging.CharacterRemoteMediator
import com.example.atlas.data.remote.api.RickMortyApi
import com.example.atlas.domain.model.Character
import com.example.atlas.domain.repository.CharacterRepository
import javax.inject.Inject
import javax.inject.Singleton
import com.example.atlas.data.mapper.toEntity

import com.example.atlas.data.mapper.toEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

@Singleton
class CharacterRepositoryImpl @Inject constructor(
    private val api: RickMortyApi,
    private val db: AppDatabase
) : CharacterRepository {

    @OptIn(ExperimentalPagingApi::class)
    override fun charactersPaged(query: String): Flow<PagingData<Character>> {
        val pagingSourceFactory = { db.characterDao().pagingSource(query) }
        return Pager(
            config = PagingConfig(pageSize = 20, enablePlaceholders = false),
            remoteMediator = if (isNetworkAvailable()) {
                CharacterRemoteMediator(query, api, db)
            } else null,
            pagingSourceFactory = pagingSourceFactory
        ).flow.map { pagingData ->
            pagingData.map { it.toDomain() }
        }
    }

    override suspend fun getCharacterById(id: Int): Character {
        val local = db.characterDao().getCharacterById(id)
        if (local != null) {
            return local.toDomain()
        }

        return try {
            val dto = api.getCharacterById(id)
            val entity = dto.toEntity()
            db.characterDao().upsertAll(listOf(entity)) // cache for offline use
            entity.toDomain()
        } catch (e: Exception) {
            throw e
        }
    }

    private fun isNetworkAvailable(): Boolean {

        return true
    }
}
