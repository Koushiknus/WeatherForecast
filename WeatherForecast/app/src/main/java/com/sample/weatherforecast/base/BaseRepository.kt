package com.sample.weatherforecast.base

import com.sample.weatherforecast.di.AppModule
import com.sample.weatherforecast.di.DaggerRepositoryInjector
import com.sample.weatherforecast.di.RepositoryInjector
import com.sample.weatherforecast.di.RepositoryModule

abstract class BaseRepository {

    private val injector: RepositoryInjector = DaggerRepositoryInjector
        .builder()
        .appModule(AppModule)
        .repositoryModule(RepositoryModule)
        .build()

    init {
        inject()
    }
    private fun inject(){
        when(this){

        }
    }}

