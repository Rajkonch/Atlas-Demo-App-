package com.example.atlas.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.atlas.data.local.entity.CharacterEntity
import com.example.atlas.data.local.entity.RemoteKey

@Dao
interface CharacterDao {
    @Query("SELECT * FROM characters WHERE name LIKE '%' || :q || '%' ORDER BY id ASC")
    fun pagingSource(q: String): PagingSource<Int, CharacterEntity>


    @Query("DELETE FROM characters")
    suspend fun clearAll()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAll(items: List<CharacterEntity>)

    @Query("SELECT * FROM characters WHERE id = :id LIMIT 1")
    suspend fun getCharacterById(id: Int): CharacterEntity?
}

@Dao
interface RemoteKeyDao {
    @Query("SELECT * FROM remote_keys WHERE id = :id")
    suspend fun remoteKeyById(id: Int): RemoteKey?

    @Query("DELETE FROM remote_keys")
    suspend fun clearRemoteKeys()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(keys: List<RemoteKey>)
}
