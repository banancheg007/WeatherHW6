package my.banancheg.com.weather_hw6.entity

import java.io.Serializable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang3.builder.ToStringBuilder

class Rain : Serializable {

    @SerializedName("3h")
    @Expose
    var h3:Double = 0.toDouble()

    override fun toString(): String {
        return ToStringBuilder(this).append("_3h", h3).toString()
    }

    companion object {
        private const val serialVersionUID = 1189529315757086841L
    }

}
