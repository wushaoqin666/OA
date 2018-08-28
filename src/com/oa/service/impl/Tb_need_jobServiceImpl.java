package com.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oa.dao.impl.Tb_need_job_DaoImpl;
import com.oa.entity.Tb_company;
import com.oa.entity.Tb_customer;
import com.oa.entity.Tb_need_job;
import com.oa.entity.Tb_person;
import com.oa.entity.Tb_person_job;
import com.oa.service.Tb_need_jobService;

@Service
@Transactional
public class Tb_need_jobServiceImpl implements Tb_need_jobService {
	@Autowired
	private Tb_need_job_DaoImpl Tb_need_job_Dao;
	
	
	@Override
	public List<Tb_need_job> RenCaiList() {
		
		return Tb_need_job_Dao.RenCaiList();
	}


	@Override
	public List<Tb_person> selectPerson() {
		return Tb_need_job_Dao.selectPerson();
	}


	@Override
	public List<Tb_person_job> selectPersonjob() {
		return Tb_need_job_Dao.selectPersonjob();
	}


	@Override
	public void delete(Integer id) {
		Tb_need_job_Dao.delete(id);
	}


	@Override
	public Tb_need_job selectneedId(int id) {
		return Tb_need_job_Dao.selectneedId(id);
	}


	@Override
	public void InsertOrUpdate(Tb_need_job need_job) {
		Tb_need_job_Dao.InsertOrUpdate(need_job);
	}


	@Override
	public void deleteperson(int id) {
		Tb_need_job_Dao.deleteperson(id);
	}


	@Override
	public Tb_person selectpersonId(int id) {
		
		return Tb_need_job_Dao.selectpersonId(id);
	}


	@Override
	public void InsertOr(Tb_person person) {
		Tb_need_job_Dao.InsertOr(person);
	}


	@Override
	public void deletepersonjob(int id) {
		Tb_need_job_Dao.deletepersonjob(id);
	}


	@Override
	public Tb_person_job selectpersonjobId(int id) {
		return Tb_need_job_Dao.selectpersonjobId(id);
	}


	@Override
	public void InsertOrjob(Tb_person_job person_job) {
		Tb_need_job_Dao.InsertOrjob(person_job);
	}

	/**
	 * 查询客户名称
	 */
	


	@Override
	public List<Tb_customer> selectpanyName() {
		
		return Tb_need_job_Dao.selectpanyName();
	}


	@Override
	public List<Tb_company> selectcompanyname() {
		
		return Tb_need_job_Dao.selectcompanyname();
	}

}
