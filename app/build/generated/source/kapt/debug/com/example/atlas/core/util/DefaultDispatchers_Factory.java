package com.example.atlas.core.util;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class DefaultDispatchers_Factory implements Factory<DefaultDispatchers> {
  @Override
  public DefaultDispatchers get() {
    return newInstance();
  }

  public static DefaultDispatchers_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DefaultDispatchers newInstance() {
    return new DefaultDispatchers();
  }

  private static final class InstanceHolder {
    private static final DefaultDispatchers_Factory INSTANCE = new DefaultDispatchers_Factory();
  }
}
