package com.oa.dao;

import java.util.List;
import java.util.Map;

import com.oa.entity.Tb_company;
import com.oa.entity.Tb_customer;
import com.oa.entity.Tb_sms_template;
import com.oa.entity.Tb_social_insurance;

import antlr.collections.impl.IntRange;

public interface Tb_Social_InsuranceDao {
	/**
	 * 查询社保信息列表
	 * @param hql  hql查询语句
	 * @param pageSize  当前页码
	 * @param pageNow   每页显示的条数
	 * @param map       参数集合
	 * @return
	 */
	public List<Tb_social_insurance> sheBaoList(StringBuffer hql,Integer pageNow,Integer pageSize,Map<String,Object> map);
	/**
	 * 查询社保信息的总条数
	 * @param idCard   身份证号
	 * @param sbCard   社保卡号
	 * @param name     客户名称
	 * @return
	 */
	public Long sheBaoCount(String idCard,String sbCard,String name);
	/**
	 * 添加社保信息
	 * @param tb_social_insurance  社保对象
	 */
	public void addSheBao(Tb_social_insurance tb_social_insurance);
	/**
	 * 删除社保信息
	 * @param id  社保编号
	 */
	public void delSheBao(Integer id);
	/**
	 * 修改社保信息
	 * @param tb_social_insurance  社保对象
	 */
	public void upSheBao(Tb_social_insurance tb_social_insurance);
	/**
	 * 根据编号查询社保信息
	 * @param id  社保编号
	 * @return    返回社保对象
	 */
	public Tb_social_insurance sheBaoById(Integer id);
	/**
	 * 根据身份证号查询客户信息
	 * @param idCard   身份证号
	 * @return       返回客户丢下
	 */
	public Tb_customer keHuByIdCard(String idCard);
	/**
	 * 查询公司信息
	 * @return 返回公司信息列表
	 */
	public List<Tb_company> gongSiList();
	/**
	 * 查询客户信息
	 * @return   返回客户信息列表
	 */
	public List<Tb_customer> keHuList();
	/**
	 * 根据客户编号查询客户信息
	 * @param id  客户编号
	 * @return    返回客户对象
	 */
	public Tb_customer keHuById(Integer id);
	
	
} 
