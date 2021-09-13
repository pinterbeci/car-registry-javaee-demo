package hu.pinterbeci.java.course.maven.rest.model;

import hu.pinterbeci.java.course.maven.entity.Car;

import java.util.List;

public class ParkingStationModel extends CoreRestModel{

    private String parkingStationName;

    private String maxOfCapacity;

    private String settlement;

    private String publicSpace;

    private String addressNumber;

    private String natureOfPublicSpace;

    private List<Long> parkingCarIDList;


    public String getParkingStationName() {
        return parkingStationName;
    }

    public void setParkingStationName(String parkingStationName) {
        this.parkingStationName = parkingStationName;
    }

    public String getMaxOfCapacity() {
        return maxOfCapacity;
    }

    public void setMaxOfCapacity(String maxOfCapacity) {
        this.maxOfCapacity = maxOfCapacity;
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

    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getNatureOfPublicSpace() {
        return natureOfPublicSpace;
    }

    public void setNatureOfPublicSpace(String natureOfPublicSpace) {
        this.natureOfPublicSpace = natureOfPublicSpace;
    }

    public List<Long> getParkingCarIDList() {
        return parkingCarIDList;
    }

    public void setParkingCarIDList(List<Long> parkingCarIDList) {
        this.parkingCarIDList = parkingCarIDList;
    }
}
