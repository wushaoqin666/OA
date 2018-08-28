package com.oa.action;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.oa.dao.impl.YingXiaoDaoImpl;
import com.oa.entity.Tb_customer;
import com.oa.entity.Tb_email_record;
import com.oa.entity.Tb_email_template;
import com.oa.entity.Tb_need_job;
import com.oa.entity.Tb_person;
import com.oa.entity.Tb_sms_record;
import com.oa.entity.Tb_sms_template;
import com.oa.service.impl.youJianServiceImpl;
import com.oa.utils.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class YingXiaoAction extends ActionSupport {
	private int id;
	private int youjianId;
	private Tb_email_record email_record;
	private Tb_sms_template sms_template;
	@Autowired
	private YingXiaoDaoImpl yingXiaoDaoImpl;
	@Autowired
	private youJianServiceImpl youJianService;
	private String now;
	private String size;
	private String subject;
	private Page<Tb_email_template> youJianPage;
	public Page<Tb_email_template> getYouJianPage() {
		return youJianPage;
	}

	public void setYouJianPage(Page<Tb_email_template> youJianPage) {
		this.youJianPage = youJianPage;
	}
/**
 * 营销信息查询
 * @return
 */
	public String YingXiaoList() {
		ActionContext req = ActionContext.getContext();
				List<Tb_email_record> list=yingXiaoDaoImpl.email_recordsList();
				req.put("list", list);
		return "yingxiaolist";
	}
	public String smsSend() {
		ActionContext req = ActionContext.getContext();
		List<Tb_sms_record> list=yingXiaoDaoImpl.sms_recordsList();
		req.put("list", list);
		return "smsSendlist";
	}
	/**
	 * 邮件模板
	 * @return
	 */
	public String youJianMoBan() {
		youJianPage= youJianService.youJianPage(now, size, subject);
		return "youJianMoBan";
	}
	/**
	 * 添加修改邮件短信
	 * @return
	 */
	public String updateEmail() {
		ActionContext req = ActionContext.getContext();
		Tb_email_record tb_email_record=yingXiaoDaoImpl.selectemailid(id);
		List<Tb_customer> customerList=yingXiaoDaoImpl.selectpanyName();
		req.put("emailrecord", tb_email_record);
		req.put("customerList", customerList);
		return "updateEmails";
	}
public String updateSms() {
	ActionContext req = ActionContext.getContext();
	Tb_sms_record tb_sms_record=yingXiaoDaoImpl.selectesmsid(id);
	List<Tb_customer> customerList=yingXiaoDaoImpl.selectpanyName();
	req.put("smsrecord", tb_sms_record);
	req.put("customerList", customerList);
		return "updateSmss";
	}
	public String smsSendsave() {
		ActionContext req = ActionContext.getContext();
		List<Tb_customer> customerList=yingXiaoDaoImpl.selectpanyName();
		req.put("customerList", customerList);
		return "smsSendsv";
	}
	
	public String emailSend() {
		ActionContext req = ActionContext.getContext();
		List<Tb_customer> customerList=yingXiaoDaoImpl.selectpanyName();
		req.put("customerList", customerList);
		if(youjianId!=0) {
			Tb_email_template email_template=yingXiaoDaoImpl.selecttemplate(youjianId);
			req.put("youjian", youjianId);
		}
		return "emailSendsave";
	}
	/**
	 * 接收并返回接收的邮件信息
	 * @return
	 */
	public String youjianXZ() {
		ActionContext req = ActionContext.getContext();
		List<Tb_customer> customerList=yingXiaoDaoImpl.selectpanyName();
		req.put("customerList", customerList);
		Tb_email_template email_template=yingXiaoDaoImpl.selecttemplate(youjianId);
		req.put("youjian", youjianId);
		return "youjianX";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tb_email_record getEmail_record() {
		return email_record;
	}

	public void setEmail_record(Tb_email_record email_record) {
		this.email_record = email_record;
	}

	public Tb_sms_template getSms_template() {
		return sms_template;
	}

	public void setSms_template(Tb_sms_template sms_template) {
		this.sms_template = sms_template;
	}

	public YingXiaoDaoImpl getYingXiaoDaoImpl() {
		return yingXiaoDaoImpl;
	}

	public void setYingXiaoDaoImpl(YingXiaoDaoImpl yingXiaoDaoImpl) {
		this.yingXiaoDaoImpl = yingXiaoDaoImpl;
	}
	public String getNow() {
		return now;
	}

	public void setNow(String now) {
		this.now = now;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getYoujianId() {
		return youjianId;
	}

	public void setYoujianId(int youjianId) {
		this.youjianId = youjianId;
	}


	
}
