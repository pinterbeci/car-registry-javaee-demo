package hu.pinterbeci.java.course.maven.dao.impl;

import hu.pinterbeci.java.course.maven.dao.OwnerDAO;
import hu.pinterbeci.java.course.maven.entity.Owner;

import javax.ejb.Stateless;

@Stateless
public class OwnerDAOImpl extends CoreDAOImpl<Owner> implements OwnerDAO {
    @Override
    protected Class<Owner> getManagedClass() {
        return Owner.class;
    }
}
