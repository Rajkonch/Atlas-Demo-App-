package com.example.atlas.data.paging

import androidx.paging.*
import androidx.room.withTransaction
import com.example.atlas.data.local.db.AppDatabase
import com.example.atlas.data.local.entity.CharacterEntity
import com.example.atlas.data.local.entity.RemoteKey
import com.example.atlas.data.mapper.toEntity
import com.example.atlas.data.remote.api.RickMortyApi

@OptIn(ExperimentalPagingApi::class)
class CharacterRemoteMediator(
    private val query: String,
    private val api: RickMortyApi,
    private val db: AppDatabase
) : RemoteMediator<Int, CharacterEntity>() {

    override suspend fun initialize(): InitializeAction = InitializeAction.LAUNCH_INITIAL_REFRESH

    override suspend fun load(loadType: LoadType, state: PagingState<Int, CharacterEntity>): MediatorResult {
        val page = when (loadType) {
            LoadType.REFRESH -> 1
            LoadType.PREPEND -> return MediatorResult.Success(endOfPaginationReached = true)
            LoadType.APPEND -> {
                val lastItem = state.lastItemOrNull() ?: return MediatorResult.Success(false)
                val key = db.remoteKeyDao().remoteKeyById(lastItem.id)?.nextKey
                key ?: return MediatorResult.Success(true)
            }
        }

        return try {
            val response = api.getCharacters(page)
            val end = response.info.next == null
            db.withTransaction {
                if (loadType == LoadType.REFRESH) {
                    db.remoteKeyDao().clearRemoteKeys()
                    db.characterDao().clearAll()
                }
                val entities = response.results
                    .filter { it.name.contains(query, ignoreCase = true) }
                    .map { it.toEntity() }
                db.characterDao().upsertAll(entities)
                val keys = entities.map {
                    RemoteKey(
                        id = it.id,
                        prevKey = if (page == 1) null else page - 1,
                        nextKey = if (end) null else page + 1
                    )
                }
                db.remoteKeyDao().insertAll(keys)
            }
            MediatorResult.Success(endOfPaginationReached = end)
        } catch (e: Exception) {
            MediatorResult.Error(e)
        }
    }
}
