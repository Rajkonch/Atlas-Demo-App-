package com.example.atlas.domain.usecase;

import com.example.atlas.domain.repository.CharacterRepository;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086B\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/atlas/domain/usecase/GetCharacterById;", "", "repo", "Lcom/example/atlas/domain/repository/CharacterRepository;", "(Lcom/example/atlas/domain/repository/CharacterRepository;)V", "invoke", "Lcom/example/atlas/domain/model/Character;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetCharacterById {
    @org.jetbrains.annotations.NotNull()
    private final com.example.atlas.domain.repository.CharacterRepository repo = null;
    
    @javax.inject.Inject()
    public GetCharacterById(@org.jetbrains.annotations.NotNull()
    com.example.atlas.domain.repository.CharacterRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.atlas.domain.model.Character> $completion) {
        return null;
    }
}