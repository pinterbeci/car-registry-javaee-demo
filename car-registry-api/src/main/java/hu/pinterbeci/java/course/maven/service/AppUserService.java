package hu.pinterbeci.java.course.maven.service;

import hu.pinterbeci.java.course.maven.entity.AppUser;

public interface AppUserService extends CoreService<AppUser> {
    AppUser findByUsername(String username);
}
