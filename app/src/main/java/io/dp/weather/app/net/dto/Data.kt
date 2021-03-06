package io.dp.weather.app.net.dto

import com.google.gson.annotations.SerializedName

data class Data(@SerializedName("current_condition") var currentCondition: List<CurrentCondition>?,
                @SerializedName("request") var request: List<Request>?,
                @SerializedName("weather") var weather: List<Weather>?)
