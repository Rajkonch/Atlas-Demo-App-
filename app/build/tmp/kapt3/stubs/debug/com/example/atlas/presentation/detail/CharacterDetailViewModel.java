package com.example.atlas.presentation.detail;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.atlas.domain.model.Character;
import com.example.atlas.domain.usecase.GetCharacterById;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/example/atlas/presentation/detail/CharacterDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "getCharacterById", "Lcom/example/atlas/domain/usecase/GetCharacterById;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/atlas/domain/usecase/GetCharacterById;Landroidx/lifecycle/SavedStateHandle;)V", "id", "", "<set-?>", "Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState;", "state", "getState", "()Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState;", "setState", "(Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "UiState", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class CharacterDetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.atlas.domain.usecase.GetCharacterById getCharacterById = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject()
    public CharacterDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.atlas.domain.usecase.GetCharacterById getCharacterById, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.atlas.presentation.detail.CharacterDetailViewModel.UiState getState() {
        return null;
    }
    
    private final void setState(com.example.atlas.presentation.detail.CharacterDetailViewModel.UiState p0) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState;", "", "Error", "Loading", "Success", "Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState$Error;", "Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState$Loading;", "Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState$Success;", "app_debug"})
    public static abstract interface UiState {
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState$Error;", "Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState;", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class Error implements com.example.atlas.presentation.detail.CharacterDetailViewModel.UiState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String msg = null;
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.String msg) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMsg() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.atlas.presentation.detail.CharacterDetailViewModel.UiState.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.String msg) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u0007\u001a\u00020\bH\u00d6\u0001J\t\u0010\t\u001a\u00020\nH\u00d6\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState$Loading;", "Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Loading implements com.example.atlas.presentation.detail.CharacterDetailViewModel.UiState {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.atlas.presentation.detail.CharacterDetailViewModel.UiState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState$Success;", "Lcom/example/atlas/presentation/detail/CharacterDetailViewModel$UiState;", "c", "Lcom/example/atlas/domain/model/Character;", "(Lcom/example/atlas/domain/model/Character;)V", "getC", "()Lcom/example/atlas/domain/model/Character;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Success implements com.example.atlas.presentation.detail.CharacterDetailViewModel.UiState {
            @org.jetbrains.annotations.NotNull()
            private final com.example.atlas.domain.model.Character c = null;
            
            public Success(@org.jetbrains.annotations.NotNull()
            com.example.atlas.domain.model.Character c) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.atlas.domain.model.Character getC() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.atlas.domain.model.Character component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.atlas.presentation.detail.CharacterDetailViewModel.UiState.Success copy(@org.jetbrains.annotations.NotNull()
            com.example.atlas.domain.model.Character c) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
    }
}