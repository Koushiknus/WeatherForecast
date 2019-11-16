package com.sample.weatherforecast.ui

import com.sample.weatherforecast.base.BaseRepository
import com.sample.weatherforecast.network.ApiMethods
import javax.inject.Inject

class GetWeatherRepository : BaseRepository() {

    @set: Inject
    var mApiMethods : ApiMethods? = null


}