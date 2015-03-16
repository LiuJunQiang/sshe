package com.sshe.dao;

import java.util.List;

public interface BaseDao<T> {
	public void save(T entity);
	public void delete(T entity);
	public void update(T entity);
	List<T> find(String hql);
}
