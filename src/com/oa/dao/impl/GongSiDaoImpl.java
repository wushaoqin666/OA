package com.oa.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oa.dao.GongSiDao;
import com.oa.entity.Tb_company;
@Repository
public class GongSiDaoImpl implements GongSiDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Tb_company> GongSiList(StringBuffer hql, Integer pageNow, Integer pageSize,Map<String, Object> map) {
		sessionFactory.getCurrentSession().createQuery(hql.toString())
		.setFirstResult((pageNow-1)*pageSize)
		.setMaxResults(pageSize)
		.setProperties(map)
		.list();
		return null;
	}

	@Override
	public void upGongSi(Tb_company gongSi) {
		sessionFactory.getCurrentSession().update(gongSi);
	}

	@Override
	public void addGongSi(Tb_company gongSi) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(gongSi);
	}

	@Override
	public Long gongSiCount(String name, String companyNo, String idCard) {
		Map<String , Object> map=new HashMap<>();
		StringBuffer hql=new StringBuffer("select count(1) from Tb_company c where 1=1");
		if(name!=null&&name!=""){
			hql.append(" and c.name like:name");
			map.put("name", "%"+name+"%");
		}
		if(companyNo!=null&&companyNo!=""){
			hql.append(" and c.companyNo like:companyNo");
			map.put("companyNo", "%"+companyNo+"%");
		}
		if(idCard!=null&&idCard!=""){
			hql.append(" and c.idCard like:idCard");
			map.put("name", "%"+idCard+"%");
		}
		sessionFactory.getCurrentSession().createQuery(hql.toString())
		.setProperties(map)
		.uniqueResult();
		return null;
	}

	@Override
	public void delGongSi(Integer id) {
		Tb_company gongSi = (Tb_company) sessionFactory.getCurrentSession().get(Tb_company.class, id);	
		sessionFactory.getCurrentSession().delete(gongSi);
	}

	@Override
	public Tb_company gongSiById(Integer id) {
		Tb_company gongSi = (Tb_company) sessionFactory.getCurrentSession().get(Tb_company.class, id);
		return gongSi;
	}

}
