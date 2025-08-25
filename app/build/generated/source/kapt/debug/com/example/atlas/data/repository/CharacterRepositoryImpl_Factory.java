package com.example.atlas.data.repository;

import com.example.atlas.data.local.db.AppDatabase;
import com.example.atlas.data.remote.api.RickMortyApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class CharacterRepositoryImpl_Factory implements Factory<CharacterRepositoryImpl> {
  private final Provider<RickMortyApi> apiProvider;

  private final Provider<AppDatabase> dbProvider;

  public CharacterRepositoryImpl_Factory(Provider<RickMortyApi> apiProvider,
      Provider<AppDatabase> dbProvider) {
    this.apiProvider = apiProvider;
    this.dbProvider = dbProvider;
  }

  @Override
  public CharacterRepositoryImpl get() {
    return newInstance(apiProvider.get(), dbProvider.get());
  }

  public static CharacterRepositoryImpl_Factory create(Provider<RickMortyApi> apiProvider,
      Provider<AppDatabase> dbProvider) {
    return new CharacterRepositoryImpl_Factory(apiProvider, dbProvider);
  }

  public static CharacterRepositoryImpl newInstance(RickMortyApi api, AppDatabase db) {
    return new CharacterRepositoryImpl(api, db);
  }
}
