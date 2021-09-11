package hu.pinterbeci.java.course.maven.dao.impl;

import hu.pinterbeci.java.course.maven.dao.CarDAO;
import hu.pinterbeci.java.course.maven.entity.Car;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class CarDAOImpl extends CoreDAOImpl<Car> implements CarDAO {

    @Override
    public List<Car> findByOwnerID(Long ownerID) {
        TypedQuery<Car> query = entityManager.createQuery("SELECT c FROM Car c WHERE c.owner.id =: ownerID",
                getManagedClass());
        query.setParameter("ownerID", ownerID);

        return query.getResultList();
    }

    @Override
    protected Class<Car> getManagedClass() {
        return Car.class;
    }

    //todo check majd, hogy jó-e
    @Override
    public List<Car> findByParkingCarByID(Long parkingCarID) {

        TypedQuery<Car> query = entityManager.createQuery("SELECT c FROM Car c " +
                "JOIN ParkingStation ps ON ps.id = c.id AND c.id =: parkingCarID", getManagedClass());
        query.setParameter("parkingCarID", parkingCarID);

        return query.getResultList();
    }
}
