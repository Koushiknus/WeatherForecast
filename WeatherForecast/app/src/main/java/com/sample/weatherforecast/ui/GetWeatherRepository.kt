package com.sample.weatherforecast.ui

import com.sample.weatherforecast.base.BaseRepository
import com.sample.weatherforecast.model.WeatherDetailResponse
import com.sample.weatherforecast.network.ApiMethods
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class GetWeatherRepository : BaseRepository() {

    @set: Inject
    var mApiMethods : ApiMethods? = null

    fun getWeatherDetails(): Observable<WeatherDetailResponse>? {
        mApiMethods?.let { apiMethods ->
            return apiMethods.getWeather("paris","json",1).subscribeOn(Schedulers.io())
        }

        return null
    }
}