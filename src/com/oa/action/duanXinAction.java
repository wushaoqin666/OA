package com.oa.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.oa.entity.Tb_sms_template;
import com.oa.service.impl.duanXinServiceImpl;
import com.oa.utils.Page;
import com.opensymphony.xwork2.ActionSupport;

public class duanXinAction extends ActionSupport{
		@Autowired
		private duanXinServiceImpl duanXinService;
		private Tb_sms_template duanXin;
		private Page<Tb_sms_template> duanXinPage;
		private String now;
		private String size;
		private String subject;
		private String template_code;
		private Integer id;
		/**
		 * 进入到短信模板列表
		 * @return
		 */
		public String duanXinList(){
				duanXinPage=duanXinService.duanXinPage(now, size,subject,template_code);
			return "duanXinList";
		}
		/**
		 * 删除短信信息
		 * @return
		 */
		public String delDuanXin(){
			duanXinService.delDuanXin(id);
			return "delDuanXin";
		}
		/**
		 * 进入到修改短信页面
		 * @return
		 */
		public String upDuanXin(){
			duanXin=duanXinService.duanXinById(id);
			return "upDuanXin";
		}
		/**
		 * 修改短信信息
		 * @return
		 */
		public String toUpDuanXin(){
			duanXinService.upDuanXin(duanXin);
			return "toUpDuanXin";
		}
		/**
		 * 进入到添加短信页面
		 * @return
		 */
		public String addDuanXin(){
			
			return "addDuanXin";
		}
		/**
		 * 添加短信信息
		 * @return
		 */
		public String toAddDuanXin(){
			duanXinService.addDuanXin(duanXin);
			return "toAddDuanXin";
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



		public String getTemplate_code() {
			return template_code;
		}



		public void setTemplate_code(String template_code) {
			this.template_code = template_code;
		}



		public Tb_sms_template getDuanXin() {
			return duanXin;
		}

		public void setDuanXin(Tb_sms_template duanXin) {
			this.duanXin = duanXin;
		}
		
		public Page<Tb_sms_template> getDuanXinPage() {
			return duanXinPage;
		}

		public void setDuanXinPage(Page<Tb_sms_template> duanXinPage) {
			this.duanXinPage = duanXinPage;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}
		
}
