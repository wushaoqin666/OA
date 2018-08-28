package com.oa.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oa.dao.Tb_newsDao;
import com.oa.entity.Tb_news;
@Repository
public class Tb_newsDaoImpl implements Tb_newsDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Tb_news> show() {
		String hql="from Tb_news";
		List<Tb_news> list = sessionFactory.getCurrentSession().createQuery(hql).list();
		return list ;		
	}

	@Override
	public Tb_news showById(int id) {		
		return (Tb_news) sessionFactory.getCurrentSession().get(Tb_news.class, id);
	}

	@Override
	public void addnews(Tb_news Tb_news) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(Tb_news);
		
	}

	@Override
	public void updatenews(Tb_news Tb_news) {
		Session session = sessionFactory.getCurrentSession();
		session.update(Tb_news);
		
	}
	
}
