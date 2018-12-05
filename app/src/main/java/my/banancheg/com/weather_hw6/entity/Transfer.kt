package my.banancheg.com.weather_hw6.entity

import java.io.Serializable

class Transfer: Serializable{
    var icon: String? = null
    var description: String? = null
    var temp: Double = 0.toDouble()
    var humidity: Long = 0
    var speedWind: Double = 0.toDouble()
    var pressure: Double = 0.toDouble()
    var clouds: Long = 0
}