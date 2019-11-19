package com.sample.weatherforecast.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.sample.weatherforecast.R
import com.sample.weatherforecast.base.ViewModelFactory

class GetWeatherActivity : AppCompatActivity() {

    private lateinit var mGetWeatherViewModel: GetWeatherViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_weather)
        initialData()
    }

    private fun initialData(){
        mGetWeatherViewModel = ViewModelProviders.of(this,ViewModelFactory(this)).get(GetWeatherViewModel::class.java)
        testAPICall()
    }

    private fun testAPICall(){

        mGetWeatherViewModel.getWeatherDetails()
    }
}
