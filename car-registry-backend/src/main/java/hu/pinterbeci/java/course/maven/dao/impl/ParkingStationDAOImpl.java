package hu.pinterbeci.java.course.maven.dao.impl;

import hu.pinterbeci.java.course.maven.dao.ParkingStationDAO;
import hu.pinterbeci.java.course.maven.entity.ParkingStation;

import javax.ejb.Stateless;

@Stateless
public class ParkingStationDAOImpl extends CoreDAOImpl<ParkingStation> implements ParkingStationDAO {

    @Override
    protected Class<ParkingStation> getManagedClass() {
        return ParkingStation.class;
    }
}
