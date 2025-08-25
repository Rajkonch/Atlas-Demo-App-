package com.example.atlas.core.di;

import com.example.atlas.data.local.dao.RemoteKeyDao;
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
public final class DatabaseModule_ProvideRemoteKeyDaoFactory implements Factory<RemoteKeyDao> {
  private final Provider<AppDatabase> dbProvider;

  public DatabaseModule_ProvideRemoteKeyDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public RemoteKeyDao get() {
    return provideRemoteKeyDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideRemoteKeyDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new DatabaseModule_ProvideRemoteKeyDaoFactory(dbProvider);
  }

  public static RemoteKeyDao provideRemoteKeyDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideRemoteKeyDao(db));
  }
}
