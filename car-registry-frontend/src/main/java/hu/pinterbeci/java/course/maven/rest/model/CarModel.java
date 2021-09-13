package hu.pinterbeci.java.course.maven.rest.model;

import java.util.Date;

public class CarModel extends CoreRestModel {

    private String series;

    private String brand;

    private String lpn;

    private String color;

    private Long ownerID;

    private Date modifiedDate;

    private Long createdUserID;

    private Long modifierUserID;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLpn() {
        return lpn;
    }

    public void setLpn(String lpn) {
        this.lpn = lpn;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Long ownerID) {
        this.ownerID = ownerID;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Long getCreatedUserID() {
        return createdUserID;
    }

    public void setCreatedUserID(Long createdUserID) {
        this.createdUserID = createdUserID;
    }

    public Long getModifierUserID() {
        return modifierUserID;
    }

    public void setModifierUserID(Long modifierUserID) {
        this.modifierUserID = modifierUserID;
    }
}
