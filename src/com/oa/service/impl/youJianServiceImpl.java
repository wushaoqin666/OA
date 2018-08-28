package com.oa.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oa.dao.impl.youJianDaoImpl;
import com.oa.entity.Tb_email_template;
import com.oa.service.youJianService;
import com.oa.utils.ConstSystem;
import com.oa.utils.Page;
@Service
@Transactional
public class youJianServiceImpl implements youJianService{
	@Autowired
	private youJianDaoImpl youJianDao;
	@Override
	public Page<Tb_email_template> youJianPage(String now, String size, String subject) {
		Map<String , Object> map=new HashMap<>();
		StringBuffer hql=new StringBuffer("from Tb_email_template e where 1=1");
		if(subject!=null &&subject!=""){
			hql.append(" and e.subject like:subject");
			map.put("subject", "%"+subject+"%");
		}
		
		//分页
		Page<Tb_email_template> page=new Page<Tb_email_template>();
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
		int count=Integer.parseInt(youJianDao.youJianCount(subject).toString());
		page.setCount(count);
		int pageCount=count%pageSize==0?(count/pageSize):(count/pageSize)+1;
		page.setPageCount(pageCount);
		List<Tb_email_template> list = youJianDao.youJianList(hql, pageNow, pageSize, map);
		page.setList(list);
		return page;
	}

	@Override
	public Tb_email_template youJianById(Integer id) {
		
		return youJianDao.youJianById(id);
	}

	@Override
	public void delYouJian(Integer id) {
		// TODO Auto-generated method stub
		youJianDao.delYouJian(id);
	}

	@Override
	public void upYouJian(Tb_email_template youJian) {
		// TODO Auto-generated method stub
		youJianDao.upYouJian(youJian);
	}

	@Override
	public void addYouJian(Tb_email_template youJian) {
		// TODO Auto-generated method stub
		youJianDao.addYouJian(youJian);
	}

}
