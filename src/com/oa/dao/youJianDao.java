package com.oa.dao;

import java.util.List;
import java.util.Map;

import com.oa.entity.Tb_email_template;

public interface youJianDao {
	
	/**
	 * 查询所有邮件信息
	 * @param hql   hql查询语句
	 * @param pageNow 当前页码
	 * @param pageSize 每页显示的条数
	 * @param map      参数集合
	 * @return
	 */
	public List<Tb_email_template> youJianList(StringBuffer hql,Integer pageNow,Integer pageSize,Map<String, Object> map);
	/**
	 * 查询邮件信息条数
	 * @param subject 邮件主题
	 * @return
	 */
	public Long youJianCount(String subject);
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
