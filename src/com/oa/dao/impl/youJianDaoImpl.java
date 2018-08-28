package com.oa.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oa.dao.youJianDao;
import com.oa.entity.Tb_email_template;
@Repository
public class youJianDaoImpl implements youJianDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Tb_email_template> youJianList(StringBuffer hql, Integer pageNow, Integer pageSize,
			Map<String, Object> map) {
		List<Tb_email_template> list = sessionFactory.getCurrentSession()
		.createQuery(hql.toString())
		.setFirstResult((pageNow-1)*pageSize)
		.setMaxResults(pageSize)
		.setProperties(map)
		.list();
		return list;
	}

	@Override
	public Long youJianCount(String subject) {
		StringBuffer hql=new StringBuffer("select count(1) from Tb_email_template e where 1=1");
		Map<String , Object> map=new HashMap<>();
		if(subject!=null && subject !=""){
			hql.append(" and e.subject like:subject");
			map.put("subject", "%"+subject+"%");
		}
		Long count = (Long) sessionFactory.getCurrentSession().createQuery(hql.toString())
		.setProperties(map)
		.uniqueResult();
		return count;
	}

	@Override
	public Tb_email_template youJianById(Integer id) {
		Tb_email_template youJian = (Tb_email_template) sessionFactory.getCurrentSession().get(Tb_email_template.class, id);
		
		return youJian;
	}

	@Override
	public void delYouJian(Integer id) {
		Tb_email_template youJian = (Tb_email_template) sessionFactory.getCurrentSession().get(Tb_email_template.class, id);
		sessionFactory.getCurrentSession().delete(youJian);
		
	}

	@Override
	public void upYouJian(Tb_email_template youJian) {
		sessionFactory.getCurrentSession().update(youJian);
	}

	@Override
	public void addYouJian(Tb_email_template youJian) {
		sessionFactory.getCurrentSession().save(youJian);
	}

}
