package com.sample.weatherforecast.base

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sample.weatherforecast.ui.GetWeatherViewModel
import javax.inject.Singleton

@Suppress("UNCHECKED_CAST")
@Singleton
class ViewModelFactory(context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if(modelClass.isAssignableFrom(GetWeatherViewModel::class.java))
            return GetWeatherViewModel() as T

        throw IllegalArgumentException("Unknown ViewModel class")

    }
}