package com.example.atlas.core.di;

import android.content.Context;
import androidx.room.Room;
import com.example.atlas.data.local.db.AppDatabase;
import com.example.atlas.data.local.dao.CharacterDao;
import com.example.atlas.data.local.dao.RemoteKeyDao;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/atlas/core/di/DatabaseModule;", "", "()V", "provideCharacterDao", "Lcom/example/atlas/data/local/dao/CharacterDao;", "db", "Lcom/example/atlas/data/local/db/AppDatabase;", "provideDb", "ctx", "Landroid/content/Context;", "provideRemoteKeyDao", "Lcom/example/atlas/data/local/dao/RemoteKeyDao;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.atlas.core.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final com.example.atlas.data.local.db.AppDatabase provideDb(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.atlas.data.local.dao.CharacterDao provideCharacterDao(@org.jetbrains.annotations.NotNull()
    com.example.atlas.data.local.db.AppDatabase db) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.atlas.data.local.dao.RemoteKeyDao provideRemoteKeyDao(@org.jetbrains.annotations.NotNull()
    com.example.atlas.data.local.db.AppDatabase db) {
        return null;
    }
}