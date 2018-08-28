package com.oa.dao.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oa.dao.sheBaoJiLuDao;
import com.oa.entity.Tb_social_insurance_record;
@Repository
public class sheBaoJiLuDaoImpl implements sheBaoJiLuDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Tb_social_insurance_record> sheBaoJiLuList(StringBuffer hql, Integer pageNow, Integer pageSize,
			Map<String, Object> map) {
		List<Tb_social_insurance_record> list = sessionFactory.getCurrentSession()
				.createQuery(hql.toString())
		.setFirstResult((pageNow-1)*pageSize)
		.setMaxResults(pageSize)
		//.setProperties(map)
		.list();
		return list;
	}

	@Override
	public Long sheBaoJiLuCount() {
		String hql="select count(1) from Tb_social_insurance_record";
		Long count = (Long) sessionFactory.getCurrentSession().createQuery(hql).uniqueResult();
		return count;
	}

	@Override
	public void delSheBaoJiLu(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upSheBaoJiLu(Tb_social_insurance_record tb_social_insurance_record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tb_social_insurance_record sheBaoJiLuById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
