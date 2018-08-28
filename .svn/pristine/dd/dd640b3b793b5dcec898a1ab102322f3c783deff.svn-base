package com.oa.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oa.dao.impl.GongSiDaoImpl;
import com.oa.entity.Tb_company;
import com.oa.entity.Tb_social_insurance;
import com.oa.service.GongSiService;
import com.oa.utils.ConstSystem;
import com.oa.utils.Page;
@Service
@Transactional
public class GongSiServiceImpl implements GongSiService{
	@Autowired
	private GongSiDaoImpl gongSiDao;
	@Override
	public Page<Tb_company> gongSiPage(String now, String size, String name, String companyNo, String idCard) {
		Map<String , Object> map=new HashMap<>();
		StringBuffer hql=new StringBuffer("from Tb_company c where 1=1");
		if(name!=null&&name!=""){
			hql.append(" and c.name like:name");
			map.put("name", "%"+name+"%");
		}
		if(companyNo!=null&&companyNo!=""){
			hql.append(" and c.companyNo like:companyNo");
			map.put("companyNo", "%"+companyNo+"%");
		}
		if(idCard!=null&&idCard!=""){
			hql.append(" and c.idCard like:idCard");
			map.put("name", "%"+idCard+"%");
		}
		Page<Tb_company> page=new Page<Tb_company>();
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
		int count=Integer.parseInt(gongSiDao.gongSiCount(name, companyNo, idCard).toString());
		page.setCount(count);
		int pageCount=count%pageSize==0?(count/pageSize):(count/pageSize)+1;
		page.setPageCount(pageCount);
		List<Tb_company> list = gongSiDao.GongSiList(hql, pageNow, pageSize, map);
		page.setList(list);
		return page;
	}

	@Override
	public void upGongSi(Tb_company gongSi) {
		// TODO Auto-generated method stub
		gongSiDao.upGongSi(gongSi);
	}

	@Override
	public void addGongSi(Tb_company gongSi) {
		// TODO Auto-generated method stub
		gongSiDao.addGongSi(gongSi);
	}

	@Override
	public void delGongSi(Integer id) {
		// TODO Auto-generated method stub
		gongSiDao.delGongSi(id);
	}

	@Override
	public Tb_company gongSiById(Integer id) {
		// TODO Auto-generated method stub
		return gongSiDao.gongSiById(id);
	}

}
