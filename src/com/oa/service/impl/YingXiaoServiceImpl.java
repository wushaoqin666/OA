package com.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oa.dao.impl.YingXiaoDaoImpl;
import com.oa.entity.Tb_customer;
import com.oa.entity.Tb_email_record;
import com.oa.entity.Tb_email_template;
import com.oa.entity.Tb_need_job;
import com.oa.entity.Tb_sms_record;
import com.oa.service.YingXiaoService;
@Service
@Transactional
public class YingXiaoServiceImpl implements YingXiaoService{
	@Autowired
	private YingXiaoDaoImpl yinxdao;
	@Override
	public List<Tb_email_record> email_recordsList() {
		return yinxdao.email_recordsList();
	}

	@Override
	public void delete(Integer id) {
		yinxdao.delete(id);
	}

	@Override
	public void InsertOrUpdate(Tb_email_record emailrecord) {
		yinxdao.InsertOrUpdate(emailrecord);
	}

	@Override
	public Tb_email_record selectemailid(int id) {
		return yinxdao.selectemailid(id);
	}

	@Override
	public List<Tb_sms_record> sms_recordsList() {
		
		return yinxdao.sms_recordsList();
	}

	@Override
	public void deletesms(Integer id) {
		yinxdao.deletesms(id);
	}

	@Override
	public Tb_sms_record selectesmsid(int id) {
		return yinxdao.selectesmsid(id);
	}
	/**
	 * 查询客户名称
	 */
	@Override
	public List<Tb_customer> selectpanyName() {
		
		return yinxdao.selectpanyName();
	}

	@Override
	public Tb_email_template selecttemplate(int youjianid) {
		return yinxdao.selecttemplate(youjianid);
	}

}
