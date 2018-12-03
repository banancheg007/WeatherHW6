
package my.banancheg.com.weather_hw6.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Main implements Serializable
{

    @SerializedName("temp")
    @Expose
    private float temp;
    @SerializedName("temp_min")
    @Expose
    private float tempMin;
    @SerializedName("temp_max")
    @Expose
    private float tempMax;
    @SerializedName("pressure")
    @Expose
    private float pressure;
    @SerializedName("sea_level")
    @Expose
    private float seaLevel;
    @SerializedName("grnd_level")
    @Expose
    private float grndLevel;
    @SerializedName("humidity")
    @Expose
    private long humidity;
    @SerializedName("temp_kf")
    @Expose
    private double tempKf;
    private final static long serialVersionUID = 3106288374917781572L;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public Main withTemp(float temp) {
        this.temp = temp;
        return this;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public Main withTempMin(float tempMin) {
        this.tempMin = tempMin;
        return this;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }

    public Main withTempMax(float tempMax) {
        this.tempMax = tempMax;
        return this;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public Main withPressure(float pressure) {
        this.pressure = pressure;
        return this;
    }

    public float getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(float seaLevel) {
        this.seaLevel = seaLevel;
    }

    public Main withSeaLevel(float seaLevel) {
        this.seaLevel = seaLevel;
        return this;
    }

    public float getGrndLevel() {
        return grndLevel;
    }

    public void setGrndLevel(float grndLevel) {
        this.grndLevel = grndLevel;
    }

    public Main withGrndLevel(float grndLevel) {
        this.grndLevel = grndLevel;
        return this;
    }

    public long getHumidity() {
        return humidity;
    }

    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public Main withHumidity(long humidity) {
        this.humidity = humidity;
        return this;
    }

    public double getTempKf() {
        return tempKf;
    }

    public void setTempKf(double tempKf) {
        this.tempKf = tempKf;
    }

    public Main withTempKf(double tempKf) {
        this.tempKf = tempKf;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("temp", temp).append("tempMin", tempMin).append("tempMax", tempMax).append("pressure", pressure).append("seaLevel", seaLevel).append("grndLevel", grndLevel).append("humidity", humidity).append("tempKf", tempKf).toString();
    }

}
