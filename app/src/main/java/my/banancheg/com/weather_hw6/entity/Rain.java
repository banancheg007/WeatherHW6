
package my.banancheg.com.weather_hw6.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Rain implements Serializable
{

    @SerializedName("3h")
    @Expose
    private float _3h;
    private final static long serialVersionUID = 2789037686485602141L;

    public float get3h() {
        return _3h;
    }

    public void set3h(float _3h) {
        this._3h = _3h;
    }

    public Rain with3h(float _3h) {
        this._3h = _3h;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("_3h", _3h).toString();
    }

}
