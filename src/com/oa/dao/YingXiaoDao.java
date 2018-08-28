package com.oa.dao;

import java.util.List;

import com.oa.entity.Tb_customer;
import com.oa.entity.Tb_email_record;
import com.oa.entity.Tb_email_template;
import com.oa.entity.Tb_sms_record;

public interface YingXiaoDao {
	/**
	 *邮件营销
	 * @return
	 */
	public List<Tb_email_record> email_recordsList();
	void delete(Integer id);
	void InsertOrUpdate(Tb_email_record emailrecord);
	Tb_email_record selectemailid(int id);
	/**
	 *短信营销
	 * @return
	 */
	public List<Tb_sms_record> sms_recordsList();
	void deletesms(Integer id);
	Tb_sms_record selectesmsid(int id);
	/**
	 * 查询所有的客户名
	 */
	List<Tb_customer> selectpanyName();
	/**
	 * 根据id查询邮件表
	 */
	Tb_email_template selecttemplate(int youjianid);
}
