package hu.pinterbeci.java.course.maven.mbean;

import hu.pinterbeci.java.course.maven.entity.Car;
import hu.pinterbeci.java.course.maven.entity.ParkingStation;
import hu.pinterbeci.java.course.maven.service.CarService;
import hu.pinterbeci.java.course.maven.service.CoreService;
import hu.pinterbeci.java.course.maven.service.ParkingStationService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ParkingStationCRUDMBean extends CoreCRUDMBean<ParkingStation> implements Serializable {

    private List<Car> parkingCarList;

    @Inject
    public ParkingStationCRUDMBean(ParkingStationService service, CarService carService) {
        super(service);
        parkingCarList = carService.getAll();
    }

    @Override
    protected String dialogName() {
        return null;
    }

    @Override
    protected ParkingStation initNewEntity() {
        return null;
    }
}
