
package my.banancheg.com.weather_hw6.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Coord implements Serializable
{

    @SerializedName("lat")
    @Expose
    private float lat;
    @SerializedName("lon")
    @Expose
    private float lon;
    private final static long serialVersionUID = -938353774521605398L;

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public Coord withLat(float lat) {
        this.lat = lat;
        return this;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public Coord withLon(float lon) {
        this.lon = lon;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lat", lat).append("lon", lon).toString();
    }

}
