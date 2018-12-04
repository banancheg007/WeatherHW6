package my.banancheg.com.weather_hw6.entity

import java.io.Serializable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang3.builder.ToStringBuilder

class Coord : Serializable {

    @SerializedName("lat")
    @Expose
    var lat: Double = 0.toDouble()
    @SerializedName("lon")
    @Expose
    var lon: Double = 0.toDouble()

    override fun toString(): String {
        return ToStringBuilder(this).append("lat", lat).append("lon", lon).toString()
    }

    companion object {
        private const val serialVersionUID = -7744502107519862517L
    }

}
