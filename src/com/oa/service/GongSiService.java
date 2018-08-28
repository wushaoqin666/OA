package com.oa.service;

import com.oa.entity.Tb_company;
import com.oa.utils.Page;

public interface GongSiService {
	
	public Page<Tb_company> gongSiPage(String now,String size,String name,String companyNo,String idCard);
	
	public void upGongSi(Tb_company gongSi);
	
	public void addGongSi(Tb_company gongSi);
	
	public void delGongSi(Integer id);
	
	public Tb_company gongSiById(Integer id);
}
