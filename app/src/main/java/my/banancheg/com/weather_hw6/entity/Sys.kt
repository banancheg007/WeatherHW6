package my.banancheg.com.weather_hw6.entity

import java.io.Serializable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang3.builder.ToStringBuilder

class Sys : Serializable {

    @SerializedName("pod")
    @Expose
    var pod: String? = null

    override fun toString(): String {
        return ToStringBuilder(this).append("pod", pod).toString()
    }

    companion object {
        private const val serialVersionUID = -6523766901800079623L
    }

}
