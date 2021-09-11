package hu.pinterbeci.java.course.maven.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "parking_station_table")
public class ParkingStation extends AbstractCar{

    @Column(name = "parking_station_name", nullable = false, length = 200)
    private String parkingStationName;

    @Column(name = "storage_capacity", nullable = false)
    private String storageCapacity;

    @Column(name = "settlement", nullable = false, length = 200)
    private String settlement;

    @Column(name = "public_space", nullable = false, length = 200)
    private String publicSpace;

    @Column(name = "nature_of_public_space", nullable = false, length = 200)
    private String natureOfPublicSpace;

    @Column(name = "address_number", nullable = false, length = 200)
    private String addressNumber;

    @OneToMany
    @JoinColumn(name = "parking_cars")
    private List<Car> parkingCarList = new ArrayList<>();

    public String getParkingStationName() {
        return parkingStationName;
    }

    public void setParkingStationName(String parkingStationName) {
        this.parkingStationName = parkingStationName;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public String getPublicSpace() {
        return publicSpace;
    }

    public void setPublicSpace(String publicSpace) {
        this.publicSpace = publicSpace;
    }

    public String getNatureOfPublicSpace() {
        return natureOfPublicSpace;
    }

    public void setNatureOfPublicSpace(String natureOfPublicSpace) {
        this.natureOfPublicSpace = natureOfPublicSpace;
    }

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public List<Car> getParkingCarList() {
        return parkingCarList;
    }

    public void setParkingCarList(List<Car> parkingCarList) {
        this.parkingCarList = parkingCarList;
    }

    public void setParkingCarList(ArrayList<Car> parkingCarList) {
        this.parkingCarList = parkingCarList;
    }
}
