package com.oa.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oa.dao.Tb_need_job_Dao;
import com.oa.entity.Tb_company;
import com.oa.entity.Tb_customer;
import com.oa.entity.Tb_need_job;
import com.oa.entity.Tb_person;
import com.oa.entity.Tb_person_job;

@Repository
@Transactional
public class Tb_need_job_DaoImpl implements Tb_need_job_Dao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Tb_need_job> RenCaiList() {
		String hql="FROM Tb_need_job";
		List<Tb_need_job> list=sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}
	@Override
	public List<Tb_person> selectPerson() {
		String hql="FROM Tb_person";
		List<Tb_person> list=sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}
	@Override
	public List<Tb_person_job> selectPersonjob() {
		String hql="FROM Tb_person_job";
		List<Tb_person_job> list=sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}
	@Override
	public void delete(Integer id) {
		Tb_need_job tb_need_job=(Tb_need_job) sessionFactory.getCurrentSession().load(Tb_need_job.class,id);
		sessionFactory.getCurrentSession().delete(tb_need_job);
	}
	@Override
	public Tb_need_job selectneedId(int id) {
		Tb_need_job need_job=(Tb_need_job) sessionFactory.getCurrentSession().get(Tb_need_job.class, id);
		return need_job;
	}
	/**
	 * 添加或修改
	 */
	@Override
	public void InsertOrUpdate(Tb_need_job need_job) {
		sessionFactory.getCurrentSession().merge(need_job);
	}
	/**
	 * person的方法
	 */
	@Override
	public void deleteperson(int id) {
		Tb_person person=(Tb_person) sessionFactory.getCurrentSession().load(Tb_person.class,id);
		sessionFactory.getCurrentSession().delete(person);
	}
	@Override
	public Tb_person selectpersonId(int id) {
		Tb_person person=(Tb_person) sessionFactory.getCurrentSession().get(Tb_person.class, id);
		return person;
	}
	@Override
	public void InsertOr(Tb_person person) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(person);
	}
	/**
	 * person_job的方法
	 */
	@Override
	public void deletepersonjob(int id) {
		Tb_person_job person_job=(Tb_person_job) sessionFactory.getCurrentSession().load(Tb_person_job.class,id);
		sessionFactory.getCurrentSession().delete(person_job);
	}
	@Override
	public Tb_person_job selectpersonjobId(int id) {
		Tb_person_job person_job=(Tb_person_job) sessionFactory.getCurrentSession().get(Tb_person_job.class, id);
		return person_job;
	}
	@Override
	public void InsertOrjob(Tb_person_job person_job) {
		Session session = sessionFactory.getCurrentSession();
	//	person_job.setCustomer((Tb_customer)session.get(Tb_customer.class, person_job.getCustomer().getId()));
		session.merge(person_job);
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
	public List<Tb_company> selectcompanyname() {
		String hql="FROM Tb_company";
		List<Tb_company> list=sessionFactory.getCurrentSession().createQuery(hql).list();
		return list;
	}
		
	

}
