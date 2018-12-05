package my.banancheg.com.weather_hw6.entity

import java.io.Serializable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import org.apache.commons.lang3.builder.ToStringBuilder

class City : Serializable {

    @SerializedName("id")
    @Expose
    var id: Long = 0
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("coord")
    @Expose
    var coord: Coord? = null
    @SerializedName("country")
    @Expose
    var country: String? = null
    @SerializedName("population")
    @Expose
    var population: Long = 0

    override fun toString(): String {
        return ToStringBuilder(this).append("id", id).append("name", name).append("coord", coord)
            .append("country", country).append("population", population).toString()
    }

    companion object {
        private const val serialVersionUID = 7398789842746228419L
    }

}
