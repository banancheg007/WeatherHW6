package my.banancheg.com.weather_hw6.entity

import java.io.Serializable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang3.builder.ToStringBuilder

class Wrapper : Serializable {

    @SerializedName("cod")
    @Expose
    var cod: String? = null
    @SerializedName("message")
    @Expose
    var message: Double = 0.toDouble()
    @SerializedName("cnt")
    @Expose
    var cnt: Long = 0
    @SerializedName("list")
    @Expose
    var list: MutableList<my.banancheg.com.weather_hw6.entity.List>? = null
    @SerializedName("city")
    @Expose
    var city: City? = null

    override fun toString(): String {
        return ToStringBuilder(this).append("cod", cod).append("message", message).append("cnt", cnt)
            .append("list", list).append("city", city).toString()
    }

    companion object {
        private const val serialVersionUID = -800097384071492797L
    }

}
