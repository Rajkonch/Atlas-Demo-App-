package com.example.atlas.domain.usecase;

import com.example.atlas.domain.repository.CharacterRepository;
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
public final class GetCharacterById_Factory implements Factory<GetCharacterById> {
  private final Provider<CharacterRepository> repoProvider;

  public GetCharacterById_Factory(Provider<CharacterRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public GetCharacterById get() {
    return newInstance(repoProvider.get());
  }

  public static GetCharacterById_Factory create(Provider<CharacterRepository> repoProvider) {
    return new GetCharacterById_Factory(repoProvider);
  }

  public static GetCharacterById newInstance(CharacterRepository repo) {
    return new GetCharacterById(repo);
  }
}
