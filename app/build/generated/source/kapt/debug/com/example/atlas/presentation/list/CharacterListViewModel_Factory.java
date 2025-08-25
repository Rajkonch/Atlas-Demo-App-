package com.example.atlas.presentation.list;

import com.example.atlas.domain.usecase.GetCharactersPaged;
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
public final class CharacterListViewModel_Factory implements Factory<CharacterListViewModel> {
  private final Provider<GetCharactersPaged> getCharactersPagedProvider;

  public CharacterListViewModel_Factory(Provider<GetCharactersPaged> getCharactersPagedProvider) {
    this.getCharactersPagedProvider = getCharactersPagedProvider;
  }

  @Override
  public CharacterListViewModel get() {
    return newInstance(getCharactersPagedProvider.get());
  }

  public static CharacterListViewModel_Factory create(
      Provider<GetCharactersPaged> getCharactersPagedProvider) {
    return new CharacterListViewModel_Factory(getCharactersPagedProvider);
  }

  public static CharacterListViewModel newInstance(GetCharactersPaged getCharactersPaged) {
    return new CharacterListViewModel(getCharactersPaged);
  }
}
