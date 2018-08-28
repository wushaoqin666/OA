package com.oa.service.impl;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oa.dao.impl.duanXinDaoImpl;
import com.oa.entity.Tb_sms_record;
import com.oa.entity.Tb_sms_template;
import com.oa.service.duanXinService;
import com.oa.utils.ConstSystem;
import com.oa.utils.Page;
@Service
@Transactional
public class duanXinServiceImpl implements duanXinService{
	@Autowired
	private duanXinDaoImpl duanxindao;
	@Override
	public Page<Tb_sms_template> duanXinPage(String now, String size, String template_code, String subject) {
		Map<String, Object> map=new HashMap<>();
		StringBuffer hql=new StringBuffer("from Tb_sms_template d where 1=1");
		if(template_code!=null && template_code !=""){
			hql.append(" and d.template_code like:template_code");
			map.put("template_code", "%"+template_code+"%");
		}
		if(subject!=null && subject!=""){
			hql.append(" and d.subject like:subject");
			map.put("subject", "%"+subject+"%");
		}
		
		
		Page<Tb_sms_template> page=new Page<Tb_sms_template>();
		int pageNow=1;
		if(now!=null){
			pageNow=Integer.parseInt(now);
		}
		page.setPageNow(pageNow);
		int pageSize=ConstSystem.PAGE_SIZE;
		if(size!=null){
			pageSize=Integer.parseInt(size);
		}
		page.setPageSize(pageSize);
		int count=Integer.parseInt(duanxindao.duanXinCount(template_code,subject).toString());
		page.setCount(count);
		int pageCount=count%pageSize==0?(count/pageSize):(count/pageSize)+1;
		page.setPageCount(pageCount);
		List<Tb_sms_template> list = duanxindao.duanXinList(hql, pageNow, pageSize, map);
		page.setList(list);
		return page;
	}

	@Override
	public Tb_sms_template duanXinById(Integer id) {
		
		return duanxindao.duanXinById(id);
	}

	@Override
	public void upDuanXin(Tb_sms_template duanXin) {
		// TODO Auto-generated method stub
		duanxindao.upDuanXin(duanXin);
	}

	@Override
	public void delDuanXin(Integer id) {
		// TODO Auto-generated method stub
		duanxindao.delDuanXin(id);
	}

	@Override
	public void addDuanXin(Tb_sms_template duanXin) {
		// TODO Auto-generated method stub
		duanxindao.addDuanXin(duanXin);
	}

	@Override
	public void addSms_record(Tb_sms_record tb_sms_record) {
		// TODO Auto-generated method stub
		duanxindao.addSms_record(tb_sms_record);
	}


}
