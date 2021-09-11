package hu.pinterbeci.java.course.maven.dao;

import hu.pinterbeci.java.course.maven.entity.Car;

import java.util.List;


public interface CarDAO extends CoreDAO<Car> {
    List<Car> findByOwnerID(Long ownerID);

    List<Car> findByParkingCarByID(Long parkingCarID);
}
