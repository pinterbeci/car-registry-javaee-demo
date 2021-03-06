package hu.pinterbeci.java.course.maven.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "parking_station_menu_item_table")
@Entity
public class MenuItem extends AbstractEntity {

    private String url;

    private String label;

    private Boolean adminFunction;

    private Boolean showMenuItem;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getAdminFunction() {
        return adminFunction;
    }

    public void setAdminFunction(Boolean adminFunction) {
        this.adminFunction = adminFunction;
    }

    public Boolean getShowMenuItem() {
        return showMenuItem;
    }

    public void setShowMenuItem(Boolean showMenuItem) {
        this.showMenuItem = showMenuItem;
    }
}
