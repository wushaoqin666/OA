package com.oa.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oa.dao.duanXinDao;
import com.oa.entity.Tb_sms_record;
import com.oa.entity.Tb_sms_template;
@Repository
public class duanXinDaoImpl implements duanXinDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Tb_sms_template> duanXinList(StringBuffer hql, Integer pageNow, Integer pageSize,
			Map<String, Object> map) {
		List<Tb_sms_template> list = sessionFactory.getCurrentSession().createQuery(hql.toString())
		.setFirstResult((pageNow-1)*pageSize)
		.setMaxResults(pageSize)
		.setProperties(map)
		.list();
		
		return list;
	}

	@Override
	public Long duanXinCount(String template_code,String subject) {
		StringBuffer hql=new StringBuffer("select count(1) from Tb_sms_template d where 1=1");
		Map<String, Object> map=new HashMap<>();
		if(template_code!=null && template_code!=""){
			hql.append(" and d.template_code like:template_code");
			map.put("template_code", "%"+template_code+"%");
			
		}
		if(subject!=null && subject!=""){
			hql.append(" and d.subject like:subject");
			map.put("subject", "%"+subject+"%");
		}
		Long count = (Long) sessionFactory.getCurrentSession()
				.createQuery(hql.toString())
				.setProperties(map)
				.uniqueResult();
		return count;
	}

	@Override
	public Tb_sms_template duanXinById(Integer id) {
		Tb_sms_template tb_sms_template = (Tb_sms_template) sessionFactory.getCurrentSession().get(Tb_sms_template.class, id);
		return tb_sms_template;
	}

	@Override
	public void upDuanXin(Tb_sms_template duanXin) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(duanXin);
	}

	@Override
	public void delDuanXin(Integer id) {
		// TODO Auto-generated method stub
		Tb_sms_template duan = (Tb_sms_template) sessionFactory.getCurrentSession().get(Tb_sms_template.class, id);
		sessionFactory.getCurrentSession().delete(duan);
	}

	@Override
	public void addDuanXin(Tb_sms_template duanXin) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(duanXin);
	}

	@Override
	public void addSms_record(Tb_sms_record tb_sms_record) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(tb_sms_record);
	}

}
