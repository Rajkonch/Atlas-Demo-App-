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
public final class GetCharactersPaged_Factory implements Factory<GetCharactersPaged> {
  private final Provider<CharacterRepository> repoProvider;

  public GetCharactersPaged_Factory(Provider<CharacterRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public GetCharactersPaged get() {
    return newInstance(repoProvider.get());
  }

  public static GetCharactersPaged_Factory create(Provider<CharacterRepository> repoProvider) {
    return new GetCharactersPaged_Factory(repoProvider);
  }

  public static GetCharactersPaged newInstance(CharacterRepository repo) {
    return new GetCharactersPaged(repo);
  }
}
