package my.banancheg.com.weather_hw6.entity

import java.io.Serializable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang3.builder.ToStringBuilder

class Clouds : Serializable {

    @SerializedName("all")
    @Expose
    var all: Long = 0

    override fun toString(): String {
        return ToStringBuilder(this).append("all", all).toString()
    }

    companion object {
        private const val serialVersionUID = -569349736908483821L
    }

}
