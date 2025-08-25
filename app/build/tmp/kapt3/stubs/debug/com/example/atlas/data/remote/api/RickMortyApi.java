package com.example.atlas.data.remote.api;

import com.example.atlas.data.remote.dto.CharacterDto;
import com.example.atlas.data.remote.dto.CharacterPageDto;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\n"}, d2 = {"Lcom/example/atlas/data/remote/api/RickMortyApi;", "", "getCharacterById", "Lcom/example/atlas/data/remote/dto/CharacterDto;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacters", "Lcom/example/atlas/data/remote/dto/CharacterPageDto;", "page", "app_debug"})
public abstract interface RickMortyApi {
    
    @retrofit2.http.GET(value = "character")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCharacters(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.atlas.data.remote.dto.CharacterPageDto> $completion);
    
    @retrofit2.http.GET(value = "character/{id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCharacterById(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.atlas.data.remote.dto.CharacterDto> $completion);
}