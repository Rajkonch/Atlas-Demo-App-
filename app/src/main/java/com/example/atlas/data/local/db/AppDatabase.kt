package com.example.atlas.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.atlas.data.local.dao.CharacterDao
import com.example.atlas.data.local.dao.RemoteKeyDao
import com.example.atlas.data.local.entity.CharacterEntity
import com.example.atlas.data.local.entity.RemoteKey

@Database(entities = [CharacterEntity::class, RemoteKey::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun characterDao(): CharacterDao
    abstract fun remoteKeyDao(): RemoteKeyDao
}
