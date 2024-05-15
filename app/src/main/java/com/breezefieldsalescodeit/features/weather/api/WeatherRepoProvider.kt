package com.breezefieldsalescodeit.features.weather.api

import com.breezefieldsalescodeit.features.task.api.TaskApi
import com.breezefieldsalescodeit.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}