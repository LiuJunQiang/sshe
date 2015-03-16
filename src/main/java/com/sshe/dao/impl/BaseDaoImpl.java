package com.sshe.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.sshe.dao.BaseDao;

public abstract class BaseDaoImpl<T> extends ActionSupport implements BaseDao<T>{
	
	@Resource
	private SessionFactory factory;
	
	protected Session getSession(){
		return this.factory.openSession();
	}

	@Override
	public void save(T entity) {
		this.getSession().save(entity);
	}

	@Override
	public void delete(T entity) {
		this.getSession().delete(entity);
	}

	@Override
	public void update(T entity) {
		this.getSession().update(entity);
	}

	@Override
	public List<T> find(String hql) {
		return this.getSession().createQuery(hql).list();
	}

}
