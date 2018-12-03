
package my.banancheg.com.weather_hw6.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Wrapper implements Serializable
{

    @SerializedName("cod")
    @Expose
    private String cod;
    @SerializedName("message")
    @Expose
    private float message;
    @SerializedName("cnt")
    @Expose
    private long cnt;
    @SerializedName("list")
    @Expose
    private java.util.List<List> list = null;
    @SerializedName("city")
    @Expose
    private City city;
    private final static long serialVersionUID = 9066878499336176180L;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Wrapper withCod(String cod) {
        this.cod = cod;
        return this;
    }

    public float getMessage() {
        return message;
    }

    public void setMessage(float message) {
        this.message = message;
    }

    public Wrapper withMessage(float message) {
        this.message = message;
        return this;
    }

    public long getCnt() {
        return cnt;
    }

    public void setCnt(long cnt) {
        this.cnt = cnt;
    }

    public Wrapper withCnt(long cnt) {
        this.cnt = cnt;
        return this;
    }

    public java.util.List<List> getList() {
        return list;
    }

    public void setList(java.util.List<List> list) {
        this.list = list;
    }

    public Wrapper withList(java.util.List<List> list) {
        this.list = list;
        return this;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Wrapper withCity(City city) {
        this.city = city;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cod", cod).append("message", message).append("cnt", cnt).append("list", list).append("city", city).toString();
    }

}
