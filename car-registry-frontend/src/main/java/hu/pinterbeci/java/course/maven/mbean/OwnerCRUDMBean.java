package hu.pinterbeci.java.course.maven.mbean;

import hu.pinterbeci.java.course.maven.entity.Owner;
import hu.pinterbeci.java.course.maven.service.CoreService;
import hu.pinterbeci.java.course.maven.service.OwnerService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class OwnerCRUDMBean extends CoreCRUDMBean<Owner> implements Serializable {

    @Inject
    public OwnerCRUDMBean(OwnerService service) {
        super(service);
    }

    @Override
    protected String dialogName() {
        return "ownerDialog";
    }

    @Override
    protected Owner initNewEntity() {
        return new Owner();
    }

    //save felülírása, ha van regisztrált felhasználó, akkor az ő adatait kapja meg.
}
