package my.banancheg.com.weather_hw6.entity

import java.io.Serializable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang3.builder.ToStringBuilder

class Weather : Serializable {

    @SerializedName("id")
    @Expose
    var id: Long = 0
    @SerializedName("main")
    @Expose
    var main: String? = null
    @SerializedName("description")
    @Expose
    var description: String? = null
    @SerializedName("icon")
    @Expose
    var icon: String? = null

    override fun toString(): String {
        return ToStringBuilder(this).append("id", id).append("main", main).append("description", description)
            .append("icon", icon).toString()
    }

    companion object {
        private const val serialVersionUID = -1147373151752824462L
    }

}
