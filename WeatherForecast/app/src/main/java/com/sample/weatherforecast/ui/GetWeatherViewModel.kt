package com.sample.weatherforecast.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.sample.weatherforecast.base.BaseViewModel
import io.reactivex.disposables.Disposable
import javax.inject.Inject

class GetWeatherViewModel : BaseViewModel() {

    private  var mSubscription: Disposable? =null
    var mErrorOccured = MutableLiveData<Throwable>()

    @set:Inject
    var mGetWeatherRepository : GetWeatherRepository? = null

    fun getWeatherDetails(){

        mGetWeatherRepository?.getWeatherDetails()?.subscribe({
            Log.v("ResultRcvd",it.data.request.size.toString())
        },{

        })

    }

}