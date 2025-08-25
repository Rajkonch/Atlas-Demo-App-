package com.example.atlas.data.repository;

import androidx.paging.*;
import com.example.atlas.data.local.db.AppDatabase;
import com.example.atlas.data.paging.CharacterRemoteMediator;
import com.example.atlas.data.remote.api.RickMortyApi;
import com.example.atlas.domain.model.Character;
import com.example.atlas.domain.repository.CharacterRepository;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlinx.coroutines.flow.Flow;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/atlas/data/repository/CharacterRepositoryImpl;", "Lcom/example/atlas/domain/repository/CharacterRepository;", "api", "Lcom/example/atlas/data/remote/api/RickMortyApi;", "db", "Lcom/example/atlas/data/local/db/AppDatabase;", "(Lcom/example/atlas/data/remote/api/RickMortyApi;Lcom/example/atlas/data/local/db/AppDatabase;)V", "charactersPaged", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/example/atlas/domain/model/Character;", "query", "", "getCharacterById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isNetworkAvailable", "", "app_debug"})
public final class CharacterRepositoryImpl implements com.example.atlas.domain.repository.CharacterRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.atlas.data.remote.api.RickMortyApi api = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.atlas.data.local.db.AppDatabase db = null;
    
    @javax.inject.Inject()
    public CharacterRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.atlas.data.remote.api.RickMortyApi api, @org.jetbrains.annotations.NotNull()
    com.example.atlas.data.local.db.AppDatabase db) {
        super();
    }
    
    @java.lang.Override()
    @kotlin.OptIn(markerClass = {androidx.paging.ExperimentalPagingApi.class})
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.example.atlas.domain.model.Character>> charactersPaged(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCharacterById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.atlas.domain.model.Character> $completion) {
        return null;
    }
    
    private final boolean isNetworkAvailable() {
        return false;
    }
}