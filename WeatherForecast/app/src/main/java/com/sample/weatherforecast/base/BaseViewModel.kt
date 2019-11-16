package com.sample.weatherforecast.base

import androidx.lifecycle.ViewModel
import com.sample.weatherforecast.di.AppModule
import com.sample.weatherforecast.di.DaggerViewModelInjector
import com.sample.weatherforecast.di.RepositoryModule
import com.sample.weatherforecast.di.ViewModelInjector
import com.sample.weatherforecast.ui.GetWeatherViewModel

abstract  class BaseViewModel : ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .appModule(AppModule)
        .repositoryModule(RepositoryModule)
        .build()

    init {
        inject()
    }

    private fun inject(){
        when (this) {
            is GetWeatherViewModel -> injector.inject(this)
        }
    }
}