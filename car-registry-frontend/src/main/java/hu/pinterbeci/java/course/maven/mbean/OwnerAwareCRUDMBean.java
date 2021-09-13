package hu.pinterbeci.java.course.maven.mbean;

import hu.pinterbeci.java.course.maven.entity.AbstractCar;
import hu.pinterbeci.java.course.maven.entity.AppUser;
import hu.pinterbeci.java.course.maven.entity.Owner;
import hu.pinterbeci.java.course.maven.service.AppUserService;
import hu.pinterbeci.java.course.maven.service.CoreService;
import hu.pinterbeci.java.course.maven.service.OwnerService;

import java.util.List;

public abstract class OwnerAwareCRUDMBean<T extends AbstractCar> extends CoreCRUDMBean<T> {

    private List<Owner> ownerList;

    public OwnerAwareCRUDMBean(CoreService<T> service, OwnerService ownerService) {
        super(service);
        ownerList = ownerService.getAll();
    }

    public List<Owner> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<Owner> ownerList) {
        this.ownerList = ownerList;
    }
}
