package com.sample.weatherforecast.network

import com.sample.weatherforecast.BuildConfig
import com.sample.weatherforecast.model.WeatherDetailResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiMethods {

    @GET("weather.ashx?"+BuildConfig.BASE_API_KEY)
    fun getWeather(@Query("q")query : String,@Query("format")format :String,@Query("num_of_days")num_of_days : Int) : Observable<WeatherDetailResponse>


}