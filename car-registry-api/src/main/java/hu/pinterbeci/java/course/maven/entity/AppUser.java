package hu.pinterbeci.java.course.maven.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@NamedQuery(name = AppUser.FIND_BY_USERNAME, query = "SELECT u FROM AppUser u WHERE u.username =: username")
@Entity
@Table(name = "car_registry_user")
public class AppUser extends AbstractEntity {

    public static final String FIND_BY_USERNAME = "AppUser.findByUsername";

    @NotNull
    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private AppUserRole role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public AppUserRole getRole() {
        return role;
    }

    public void setRole(AppUserRole role) {
        this.role = role;
    }
}

