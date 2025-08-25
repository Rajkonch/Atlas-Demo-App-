package com.example.atlas.presentation.detail;

import androidx.lifecycle.SavedStateHandle;
import com.example.atlas.domain.usecase.GetCharacterById;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation"
})
public final class CharacterDetailViewModel_Factory implements Factory<CharacterDetailViewModel> {
  private final Provider<GetCharacterById> getCharacterByIdProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public CharacterDetailViewModel_Factory(Provider<GetCharacterById> getCharacterByIdProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.getCharacterByIdProvider = getCharacterByIdProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public CharacterDetailViewModel get() {
    return newInstance(getCharacterByIdProvider.get(), savedStateHandleProvider.get());
  }

  public static CharacterDetailViewModel_Factory create(
      Provider<GetCharacterById> getCharacterByIdProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new CharacterDetailViewModel_Factory(getCharacterByIdProvider, savedStateHandleProvider);
  }

  public static CharacterDetailViewModel newInstance(GetCharacterById getCharacterById,
      SavedStateHandle savedStateHandle) {
    return new CharacterDetailViewModel(getCharacterById, savedStateHandle);
  }
}
