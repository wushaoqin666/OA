package com.oa.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oa.dao.impl.sheBaoJiLuDaoImpl;
import com.oa.entity.Tb_sms_template;
import com.oa.entity.Tb_social_insurance_record;
import com.oa.service.sheBaoJiLuService;
import com.oa.utils.ConstSystem;
import com.oa.utils.Page;
@Service
@Transactional
public class sheBaoJiLuServiceImpl implements sheBaoJiLuService{
	@Autowired
	private sheBaoJiLuDaoImpl sheBaoJiLuDao;
	@Override
	public Page<Tb_social_insurance_record> sheBaoJiLuPage(String now, String size, String name, String idCard,
			String sbCard) {
		Map<String, Object> map=new HashMap<>();
		StringBuffer hql=new StringBuffer("from Tb_social_insurance_record");
		/*if(name!=null && name!=""){
			hql.append(" and c.name like:name");
			map.put("name", name);
		}
		if(idCard!=null&& idCard!=""){
			hql.append(" and sb.idCard like:idCard");
			map.put("idCard", idCard);
		}
		if(sbCard!=null && sbCard!=""){
			hql.append(" and s.sbCard like:sbCard");
			map.put("sbCard", sbCard);
		}*/
		//分页
		Page<Tb_social_insurance_record> page=new Page<Tb_social_insurance_record>();
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
		int count=Integer.parseInt(sheBaoJiLuDao.sheBaoJiLuCount().toString());
		page.setCount(count);
		int pageCount=count%pageSize==0?(count/pageSize):(count/pageSize)+1;
		page.setPageCount(pageCount);
		List<Tb_social_insurance_record> list = sheBaoJiLuDao.sheBaoJiLuList(hql, pageNow, pageSize, map);
		page.setList(list);
		return page;
	}


	@Override
	public void delSheBaoJiLu(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upSheBaoJiLu(Tb_social_insurance_record tb_social_insurance_record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tb_social_insurance_record sheBaoJiLuById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
