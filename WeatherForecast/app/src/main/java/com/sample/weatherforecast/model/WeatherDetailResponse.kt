package com.sample.weatherforecast.model

class WeatherDetailResponse {


    val  data = Data()


    class Data(){

        val  request = ArrayList<Request> ()
    }

    class Request(){
        val type : String? = ""
        val query : String? = ""
    }
}