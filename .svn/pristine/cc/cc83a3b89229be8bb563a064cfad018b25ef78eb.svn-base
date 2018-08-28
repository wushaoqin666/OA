package com.oa.dao;

import java.util.List;
import java.util.Map;

import com.oa.entity.Tb_sms_record;
import com.oa.entity.Tb_sms_template;

public interface duanXinDao {
	/**
	 * 查询短信列表
	 * @param hql   hql语句
	 * @param pageNow 当前页码
	 * @param pageSize 每页显示的条数
	 * @param map       参数集合
	 * @return
	 */
	public List<Tb_sms_template> duanXinList(StringBuffer hql,Integer pageNow,Integer pageSize,Map<String, Object> map);
	/**
	 * 查询短信条数	
	 * @return
	 */
	public Long duanXinCount(String template_code,String subject);
	/**
	 * 根据编号查询短信信息
	 * @param id  短信编号
	 * @return   返回短信对象
	 */
	public Tb_sms_template duanXinById(Integer id);
	/**
	 * 修改短信信息
	 * @param duanXin  短信对象
	 */
	public void upDuanXin(Tb_sms_template duanXin);
	/**
	 * 删除短信信息
	 * @param id  短信编号
	 */
	public void delDuanXin(Integer id);
	/**
	 * 添加短信信息
	 * @param duanXin 短信对象
	 */
	public void addDuanXin(Tb_sms_template duanXin);
	/**
	 * 发送短信
	 * @param tb_sms_record
	 */
	public void addSms_record(Tb_sms_record tb_sms_record);
}
