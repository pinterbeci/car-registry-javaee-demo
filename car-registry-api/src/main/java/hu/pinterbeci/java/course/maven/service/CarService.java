package hu.pinterbeci.java.course.maven.service;


import hu.pinterbeci.java.course.maven.entity.Car;

import java.util.List;

public interface CarService extends CoreService<Car> {

    List<Car> findByOwnerID(Long ownerID);

    List<Car> findByParkingCarByID(Long parkingCarID);
}
