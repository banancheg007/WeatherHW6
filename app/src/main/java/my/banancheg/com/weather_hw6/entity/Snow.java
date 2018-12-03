
package my.banancheg.com.weather_hw6.entity;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Snow implements Serializable
{

    private final static long serialVersionUID = -7389114185370853540L;

    @Override
    public String toString() {
        return new ToStringBuilder(this).toString();
    }

}
