package my.banancheg.com.weather_hw6.entity

import java.io.Serializable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang3.builder.ToStringBuilder

class List : Serializable {

    @SerializedName("dt")
    @Expose
    var dt: Long = 0
    @SerializedName("main")
    @Expose
    var main: Main? = null
    @SerializedName("weather")
    @Expose
    var weather: MutableList<Weather>? = null
    @SerializedName("clouds")
    @Expose
    var clouds: Clouds? = null
    @SerializedName("wind")
    @Expose
    var wind: Wind? = null
    @SerializedName("rain")
    @Expose
    var rain: Rain? = null
    @SerializedName("sys")
    @Expose
    var sys: Sys? = null
    @SerializedName("dt_txt")
    @Expose
    var dtTxt: String? = null
    @SerializedName("snow")
    @Expose
    var snow: Snow? = null

    override fun toString(): String {
        return ToStringBuilder(this).append("dt", dt).append("main", main).append("weather", weather)
            .append("clouds", clouds).append("wind", wind).append("rain", rain).append("sys", sys)
            .append("dtTxt", dtTxt).append("snow", snow).toString()
    }

    companion object {
        private const val serialVersionUID = -814952442214612341L
    }

}
