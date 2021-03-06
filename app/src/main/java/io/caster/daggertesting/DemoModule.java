package io.caster.daggertesting;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.caster.daggertesting.forecast.ForecastService;
import io.caster.daggertesting.forecast.ForecastServiceImpl;

@Module
public class DemoModule {
    @Provides @Singleton
    public ForecastService providesForecastService() {
        return new ForecastServiceImpl(); // This is a concrete IMPL with hard HTTP deps on Retrofit. View the previous episodes on Caster.IO too see how to break them apart
    }
}
