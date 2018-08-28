package com.oa.dao;

import java.util.List;

import com.oa.entity.Tb_company;
import com.oa.entity.Tb_customer;
import com.oa.entity.Tb_need_job;
import com.oa.entity.Tb_person;
import com.oa.entity.Tb_person_job;

public interface Tb_need_job_Dao {
	/**
	 * 招聘信息查询
	 * @return
	 */
	public List<Tb_need_job> RenCaiList();
	void delete(Integer id);
	void InsertOrUpdate(Tb_need_job need_job);
	Tb_need_job selectneedId(int id);
	/**
	 * 人才信息查询
	 */
	public List<Tb_person> selectPerson();
	void deleteperson(int id);
	Tb_person selectpersonId(int id);
	void InsertOr(Tb_person person);
	/**
	 * 劳务信息查询
	 */
	public List<Tb_person_job> selectPersonjob();
	void deletepersonjob(int id);
	Tb_person_job selectpersonjobId(int id);
	void InsertOrjob(Tb_person_job person_job);
	/**
	 * 查询所有的客户名
	 */
	List<Tb_customer> selectpanyName();
	/**
	 * 查询所有的公司名
	 */
	List<Tb_company> selectcompanyname();
}
