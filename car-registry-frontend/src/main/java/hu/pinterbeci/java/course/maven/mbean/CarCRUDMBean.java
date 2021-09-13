package hu.pinterbeci.java.course.maven.mbean;

import hu.pinterbeci.java.course.maven.entity.Car;
import hu.pinterbeci.java.course.maven.service.AppUserService;
import hu.pinterbeci.java.course.maven.service.CoreService;
import hu.pinterbeci.java.course.maven.service.OwnerService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CarCRUDMBean extends OwnerAwareCRUDMBean<Car> implements Serializable {

    @Inject
    public CarCRUDMBean(CoreService<Car> service, OwnerService ownerService) {
        super(service, ownerService);
    }

    @Override
    protected String dialogName() {
        return "carDialog";
    }

    @Override
    protected Car initNewEntity() {
        return new Car();
    }
}
