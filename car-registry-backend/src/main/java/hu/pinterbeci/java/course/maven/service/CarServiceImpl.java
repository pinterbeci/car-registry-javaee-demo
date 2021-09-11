package hu.pinterbeci.java.course.maven.service;

import hu.pinterbeci.java.course.maven.dao.CarDAO;
import hu.pinterbeci.java.course.maven.entity.Car;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class CarServiceImpl extends AbstractServiceImpl<Car> implements CarService {

    @Override
    public List<Car> findByOwnerID(Long ownerID) {
        return ((CarDAO) dao).findByOwnerID(ownerID);
    }

    @Override
    public List<Car> findByParkingCarByID(Long parkingCarID) {
        return ((CarDAO) dao).findByParkingCarByID(parkingCarID);
    }
}
