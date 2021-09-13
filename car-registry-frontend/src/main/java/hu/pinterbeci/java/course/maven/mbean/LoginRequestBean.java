package hu.pinterbeci.java.course.maven.mbean;

import hu.pinterbeci.java.course.maven.entity.AppUserRole;
import hu.pinterbeci.java.course.maven.mbean.model.LoggedInUserModel;
import hu.pinterbeci.java.course.maven.mbean.model.LoginModel;
import hu.pinterbeci.java.course.maven.service.AppUserService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class LoginRequestBean implements Serializable {

    @Inject
    private LoggedInUserBean bean;

    @Inject
    private AppUserService appUserService;

    private LoginModel loginModel = new LoginModel();

    //todo
    public void doLogin() {

    }

    //todo
    public void doLogout() {

    }

    public LoginModel getLoginModel() {
        return loginModel;
    }

    public void setLoginModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }
}
