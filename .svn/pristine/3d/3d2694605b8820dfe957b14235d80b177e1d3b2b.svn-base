package com.oa.service;

import com.oa.entity.Tb_email_template;
import com.oa.utils.Page;

public interface youJianService {
	
	public Page<Tb_email_template> youJianPage(String now,String size,String subject);
	
	/**
	 * 根据邮件编号查询邮件信息
	 * @param id   邮件编号
	 * @return     返回邮件信息对象
	 */
	public Tb_email_template youJianById(Integer id);
	/**
	 * 删除邮件信息
	 * @param id  邮件编号
	 */
	public void delYouJian(Integer id);
	/**
	 * 修改邮件信息
	 * @param youJian  邮件对象
	 */
	public void upYouJian(Tb_email_template youJian);
	/**
	 * 添加邮件信息
	 * @param youJian  邮件对象
	 */
	public void addYouJian(Tb_email_template youJian);
}
