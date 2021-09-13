package hu.pinterbeci.java.course.maven.mbean;

import hu.pinterbeci.java.course.maven.entity.AppUser;
import hu.pinterbeci.java.course.maven.service.AppUserService;
import hu.pinterbeci.java.course.maven.service.CoreService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class AppUserCRUDMBean extends CoreCRUDMBean<AppUser> implements Serializable {


    @Inject
    public AppUserCRUDMBean(AppUserService service) {
        super(service);
    }

    @Override
    protected String dialogName() {
        return "appUserDialog";
    }

    @Override
    protected AppUser initNewEntity() {
        return new AppUser();
    }


    //todo save method felülírása bejelentkezés esetén kerüljön mentésre a frissen regisztrált user
}
