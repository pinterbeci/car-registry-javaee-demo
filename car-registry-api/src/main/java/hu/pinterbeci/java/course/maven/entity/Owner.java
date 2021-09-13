package hu.pinterbeci.java.course.maven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "owner_table")
public class Owner extends AbstractEntity {

    @Column(name = "full_name", nullable = false)
    private String fullName;


    //todo
    //megszorítás hozzáadása, hogy normális neveket lehessen csak megadni
    @Column(name = "owner_username", nullable = false, length = 200)
    private String username;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(fullName, owner.fullName) && Objects.equals(username, owner.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, username);
    }
}
