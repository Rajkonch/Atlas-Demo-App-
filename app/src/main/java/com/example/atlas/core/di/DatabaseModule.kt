package com.example.atlas.core.di

import android.content.Context
import androidx.room.Room
import com.example.atlas.data.local.db.AppDatabase
import com.example.atlas.data.local.dao.CharacterDao
import com.example.atlas.data.local.dao.RemoteKeyDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides @Singleton
    fun provideDb(@ApplicationContext ctx: Context): AppDatabase =
        Room.databaseBuilder(ctx, AppDatabase::class.java, "atlas.db")
            .fallbackToDestructiveMigration()
            .build()

    @Provides fun provideCharacterDao(db: AppDatabase): CharacterDao = db.characterDao()
    @Provides fun provideRemoteKeyDao(db: AppDatabase): RemoteKeyDao = db.remoteKeyDao()
}
