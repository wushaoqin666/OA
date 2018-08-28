package com.oa.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oa.dao.YingXiaoDao;
import com.oa.entity.Tb_customer;
import com.oa.entity.Tb_email_record;
import com.oa.entity.Tb_email_template;
import com.oa.entity.Tb_need_job;
import com.oa.entity.Tb_sms_record;
@Repository
@Transactional
public class YingXiaoDaoImpl implements YingXiaoDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Tb_email_record> email_recordsList() {
		String hql="FROM Tb_email_record";
		List<Tb_email_record> list=sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}

	@Override
	public void delete(Integer id) {
		Tb_email_record email_record=(Tb_email_record) sessionFactory.getCurrentSession().load(Tb_email_record.class,id);
		sessionFactory.getCurrentSession().delete(email_record);
	}

	@Override
	public void InsertOrUpdate(Tb_email_record emailrecord) {
		sessionFactory.getCurrentSession().merge(emailrecord);
	}

	@Override
	public Tb_email_record selectemailid(int id) {
		Tb_email_record email_record=(Tb_email_record) sessionFactory.getCurrentSession().get(Tb_email_record.class,id);
		return email_record;
	}

	@Override
	public List<Tb_sms_record> sms_recordsList() {
		String hql="FROM Tb_sms_record";
		List<Tb_sms_record> list=sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}

	@Override
	public void deletesms(Integer id) {
		Tb_sms_record sms_record=(Tb_sms_record) sessionFactory.getCurrentSession().load(Tb_sms_record.class,id);
		sessionFactory.getCurrentSession().delete(sms_record);
	}

	@Override
	public Tb_sms_record selectesmsid(int id) {
		Tb_sms_record sms_record=(Tb_sms_record) sessionFactory.getCurrentSession().get(Tb_sms_record.class,id);
		return sms_record;
	}
	/**
	 * 查询客户名称
	 */
	@Override
	public List<Tb_customer> selectpanyName() {
		String hql="FROM Tb_customer";
		List<Tb_customer> list=sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}

	@Override
	public Tb_email_template selecttemplate(int youjianid) {
		Tb_email_template email_template=(Tb_email_template) sessionFactory.getCurrentSession().get(Tb_email_template.class,youjianid);
		return email_template;
	}



}
