package com.example.atlas.core.di;

import com.example.atlas.data.local.dao.CharacterDao;
import com.example.atlas.data.local.db.AppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideCharacterDaoFactory implements Factory<CharacterDao> {
  private final Provider<AppDatabase> dbProvider;

  public DatabaseModule_ProvideCharacterDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public CharacterDao get() {
    return provideCharacterDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideCharacterDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new DatabaseModule_ProvideCharacterDaoFactory(dbProvider);
  }

  public static CharacterDao provideCharacterDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideCharacterDao(db));
  }
}
