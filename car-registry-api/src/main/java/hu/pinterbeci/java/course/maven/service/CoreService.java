package hu.pinterbeci.java.course.maven.service;

import hu.pinterbeci.java.course.maven.entity.AbstractEntity;

import java.util.List;

public interface CoreService<T extends AbstractEntity> {

    List<T> getAll();

    T findById(Long id);

    void add(T entity);

    void remove(T entity);

    void update(T entity);
}
