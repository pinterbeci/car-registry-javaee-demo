package hu.pinterbeci.java.course.maven.service;

import hu.pinterbeci.java.course.maven.dao.AppUserDAO;
import hu.pinterbeci.java.course.maven.entity.AppUser;

import javax.ejb.Stateless;

@Stateless
public class AppUserServiceImpl extends AbstractServiceImpl<AppUser> implements AppUserService {

    @Override
    public AppUser findByUsername(String username) {
        return ((AppUserDAO) (dao)).findByUsername(username);
    }
}
