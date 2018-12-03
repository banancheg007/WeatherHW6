
package my.banancheg.com.weather_hw6.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Wind implements Serializable
{

    @SerializedName("speed")
    @Expose
    private float speed;
    @SerializedName("deg")
    @Expose
    private float deg;
    private final static long serialVersionUID = -8621586987972529457L;

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Wind withSpeed(float speed) {
        this.speed = speed;
        return this;
    }

    public float getDeg() {
        return deg;
    }

    public void setDeg(float deg) {
        this.deg = deg;
    }

    public Wind withDeg(float deg) {
        this.deg = deg;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("speed", speed).append("deg", deg).toString();
    }

}
