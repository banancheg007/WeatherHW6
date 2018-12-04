package my.banancheg.com.weather_hw6.entity

import java.io.Serializable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang3.builder.ToStringBuilder

class Wind : Serializable {

    @SerializedName("speed")
    @Expose
    var speed: Double = 0.toDouble()
    @SerializedName("deg")
    @Expose
    var deg: Double = 0.toDouble()

    override fun toString(): String {
        return ToStringBuilder(this).append("speed", speed).append("deg", deg).toString()
    }

    companion object {
        private const val serialVersionUID = -1676706134638735711L
    }

}
