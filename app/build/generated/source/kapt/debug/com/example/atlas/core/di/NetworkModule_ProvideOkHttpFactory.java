package com.example.atlas.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

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
public final class NetworkModule_ProvideOkHttpFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> loggerProvider;

  public NetworkModule_ProvideOkHttpFactory(Provider<HttpLoggingInterceptor> loggerProvider) {
    this.loggerProvider = loggerProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttp(loggerProvider.get());
  }

  public static NetworkModule_ProvideOkHttpFactory create(
      Provider<HttpLoggingInterceptor> loggerProvider) {
    return new NetworkModule_ProvideOkHttpFactory(loggerProvider);
  }

  public static OkHttpClient provideOkHttp(HttpLoggingInterceptor logger) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideOkHttp(logger));
  }
}
