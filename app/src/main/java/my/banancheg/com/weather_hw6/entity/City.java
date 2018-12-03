
package my.banancheg.com.weather_hw6.entity;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class City implements Serializable
{

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("coord")
    @Expose
    private Coord coord;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("population")
    @Expose
    private long population;
    private final static long serialVersionUID = 7065021769022567348L;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public City withId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City withName(String name) {
        this.name = name;
        return this;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public City withCoord(Coord coord) {
        this.coord = coord;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public City withCountry(String country) {
        this.country = country;
        return this;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public City withPopulation(long population) {
        this.population = population;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("coord", coord).append("country", country).append("population", population).toString();
    }

}
