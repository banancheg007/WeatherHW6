package my.banancheg.com.weather_hw6.entity

import java.io.Serializable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang3.builder.ToStringBuilder

class Main : Serializable {

    @SerializedName("temp")
    @Expose
    var temp: Double = 0.toDouble()
    @SerializedName("temp_min")
    @Expose
    var tempMin: Double = 0.toDouble()
    @SerializedName("temp_max")
    @Expose
    var tempMax: Double = 0.toDouble()
    @SerializedName("pressure")
    @Expose
    var pressure: Double = 0.toDouble()
    @SerializedName("sea_level")
    @Expose
    var seaLevel: Double = 0.toDouble()
    @SerializedName("grnd_level")
    @Expose
    var grndLevel: Double = 0.toDouble()
    @SerializedName("humidity")
    @Expose
    var humidity: Long = 0
    @SerializedName("temp_kf")
    @Expose
    var tempKf: Double = 0.00

    override fun toString(): String {
        return ToStringBuilder(this).append("temp", temp).append("tempMin", tempMin).append("tempMax", tempMax)
            .append("pressure", pressure).append("seaLevel", seaLevel).append("grndLevel", grndLevel)
            .append("humidity", humidity).append("tempKf", tempKf).toString()
    }

    companion object {
        private const val serialVersionUID = -7805679441237592366L
    }

}
