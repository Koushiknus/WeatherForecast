package com.sample.weatherforecast.di

import com.sample.weatherforecast.ui.GetWeatherRepository
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
// Safe here as we are dealing with a Dagger 2 module
@Suppress("unused")
object RepositoryModule {

    @Provides
    @Reusable
    @JvmStatic
    internal fun providesGetWeatherRepository() : GetWeatherRepository{

        return GetWeatherRepository()
    }
}