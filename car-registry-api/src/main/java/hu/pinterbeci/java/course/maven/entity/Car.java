package hu.pinterbeci.java.course.maven.entity;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "car_table")
public class Car extends AbstractCar{

    private static final String PATTERN_MESSAGE = "Meg kell feleljen egy magyar rendszám szabványának" +
            "\n pld.: XXX-999, XXXX-99, XXXXX-9";

    @Column(name = "brand_of_car", nullable = false)
    private String brand;

    @Column(name = "series_of_car", nullable = false)
    private String series;

    @Column(name = "color_of_car", nullable = false)
    private String color;

    //todo  rendszám ellenörzése!!!!! xxx-999, xxxx-99, xxxxx-9
    @Column(name = "licence_plate_number", nullable = false)
    @Pattern(regexp = "\\[A-Z]{3,3}-[0-9]{3,3}|\\[A-Z]{4,4}-[0-9]{2,2}|\\[A-Z]{5,5}-[0-9]{1,1}",
            message = PATTERN_MESSAGE)
    private String lpn;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private AppUser owner;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLpn() {
        return lpn;
    }

    public void setLpn(String lpn) {
        this.lpn = lpn;
    }

    public AppUser getOwner() {
        return owner;
    }

    public void setOwner(AppUser owner) {
        this.owner = owner;
    }
}
