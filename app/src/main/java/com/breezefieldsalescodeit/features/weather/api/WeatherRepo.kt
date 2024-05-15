package com.breezefieldsalescodeit.features.weather.api

import com.breezefieldsalescodeit.base.BaseResponse
import com.breezefieldsalescodeit.features.task.api.TaskApi
import com.breezefieldsalescodeit.features.task.model.AddTaskInputModel
import com.breezefieldsalescodeit.features.weather.model.ForeCastAPIResponse
import com.breezefieldsalescodeit.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}