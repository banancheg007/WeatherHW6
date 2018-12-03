
package my.banancheg.com.weather_hw6.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Sys implements Serializable
{

    @SerializedName("pod")
    @Expose
    private String pod;
    private final static long serialVersionUID = 2600681293992773302L;

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public Sys withPod(String pod) {
        this.pod = pod;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pod", pod).toString();
    }

}
