package hu.pinterbeci.java.course.maven.dao.impl;

import hu.pinterbeci.java.course.maven.dao.MenuItemDAO;
import hu.pinterbeci.java.course.maven.entity.MenuItem;

import javax.ejb.Stateless;

@Stateless
public class MenuItemDAOImpl extends CoreDAOImpl<MenuItem> implements MenuItemDAO {
    @Override
    protected Class<MenuItem> getManagedClass() {
        return MenuItem.class;
    }
}
