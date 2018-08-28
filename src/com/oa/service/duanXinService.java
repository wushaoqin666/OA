package com.oa.service;

import com.oa.entity.Tb_sms_record;
import com.oa.entity.Tb_sms_template;
import com.oa.utils.Page;

public interface duanXinService {
	/**
	 * 查询一页数据
	 * @param now  当前页码
	 * @param size 每页显示的条数
	 * @param template_code   短信编码
	 * @param subject         短信主题
	 * @return
	 */
	public Page<Tb_sms_template> duanXinPage(String now,String size,String template_code,String subject);
	/**
	 * 根据编号查询短信信息
	 * @param id   短信编号
	 * @return
	 */
	public Tb_sms_template duanXinById(Integer id);
	
	/**
	 * 修改短信信息
	 * @param duanXin  短信对象
	 */
	public void upDuanXin(Tb_sms_template duanXin);
	/**
	 * 根据编号删除短信信息
	 * @param id   短信编号
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
