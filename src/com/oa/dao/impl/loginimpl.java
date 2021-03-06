package com.oa.dao.impl;



import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oa.dao.login;


import com.oa.entity.tb_user;
@Repository
public class loginimpl implements login{

	@Autowired
	private SessionFactory SessionFactory;
	
	@Override
	public tb_user selectuser(String username,String password) {
		String sql="from tb_user where username=? and PASSWORD=?";
		return (tb_user) SessionFactory.getCurrentSession().createQuery(sql).setString(0, username).setString(1, password).uniqueResult();
	}

	
	
	
	public SessionFactory getSessionFactory() {
		return SessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		SessionFactory = sessionFactory;
	}




	@Override
	public List<tb_user> list() {
		// TODO Auto-generated method stub
		String sql="from tb_user ORDER BY sortnum";
		return SessionFactory.getCurrentSession().createQuery(sql).list();
	}




	@Override
	public List<tb_user> showusers(String name, String phone,Integer status) {
		String sql="FROM tb_user WHERE username LIKE ? AND phone LIKE ? and status=?";
		return SessionFactory.getCurrentSession().createQuery(sql).setString(0, "%"+name+"%").setString(1, "%"+phone+"%").setInteger(2, status).list();
	}




	@Override
	public tb_user userByName(String name) {
		String hql="from tb_user where username=:name";
		return (tb_user) SessionFactory.getCurrentSession().createQuery(hql).setString("name", name).uniqueResult();
	}






}
