package com.oa.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.oa.dao.impl.Accumulation_fund_Dao_impl;
import com.oa.entity.Tb_accumulation_fund;
import com.oa.entity.Tb_customer;
import com.oa.service.Accumulation_fund_Service;
import com.oa.utils.ConstSystem;
import com.oa.utils.Page;

/**
 * 公积金表业务逻辑实现层
 * @author 吴少钦
 *
 */
@Service
@Transactional
public class Accumulation_fund_Service_impl  implements Accumulation_fund_Service{
	@Autowired
	private Accumulation_fund_Dao_impl accDao;
	
	//******************************************************************************************
	/**
	 * 查询出客户的信息
	 */
	@Override
	public List<Tb_customer> customersBy() {
		return accDao.customersBy();
	}
	/**
	 * 模糊查询并分页
	 */
	@Override
	public Page<Tb_accumulation_fund> accumulation_fundSelect(String now,String size,String idCard,String accountNo) {
		if (idCard == null || "".equals(idCard)) {
			idCard="%%";
		}
		if (accountNo == null || "".equals(accountNo)) {
			accountNo="%%";
		}
		idCard = "%"+idCard+"%";
		accountNo = "%"+accountNo+"%";
		//-------------------------分页------------------------------------------------------
		Page<Tb_accumulation_fund> page = new Page<Tb_accumulation_fund>();
		int pageNow = 1;
		if(now!=null) {
			pageNow = Integer.parseInt(now);
		}
		page.setPageNow(pageNow);
		int pageSize = ConstSystem.PAGE_SIZE;
		if(size!=null) {
			pageSize = Integer.parseInt(size);
		}
		page.setPageSize(pageSize);
		int count =  Integer.parseInt(accDao.GjjCount().toString());
		page.setCount(count);
		int pageCount = count%pageSize==0?(count/pageSize):(count/pageSize)+1;
		page.setPageCount(pageCount);
		//-------------------------分页------------------------------------------------------
		
		//接收查询出的object的对象集合
		List<Object> list1 = accDao.SelectAccumulation_fundAll(idCard, accountNo, pageNow, pageSize);
		//创建一个公积金表的集合
		List<Tb_accumulation_fund> list2 = new ArrayList<Tb_accumulation_fund>();
		//循环集合对象
		for(int i=0;i<list1.size();i++) {
			//创建对象数组并将 集合中的对象放入数组中
			Object[] obj = (Object[]) list1.get(i);
			//将数组中的两组数据分别强转于相对的对象
			//主表，接收公积金的值
			Tb_accumulation_fund tb_accumulation_fund = (Tb_accumulation_fund) obj[0];
			//用户表
			tb_accumulation_fund.setCustomer((Tb_customer)obj[1]);
			//将对象放入集合
			list2.add(tb_accumulation_fund);
		}
		page.setList(list2);
		return page;
	}
	/**
	 * 通过id来删除
	 */
	@Override
	public void DeleteTb_accumulation_fundById(Integer id) {
			accDao.DeleteTb_accumulation_fundById(id);
	}
	/**
	 * 添加
	 */
	@Override
	public void AddTb_accumulation_fund(Tb_accumulation_fund acc_fund) {
		accDao.AddTb_accumulation_fund(acc_fund);
	}
	/**
	 * 通过id来修改
	 */
	@Override
	public Tb_accumulation_fund selectTb_accumulation_fundById(Integer id) {
		return accDao.selectAccumulation_fundById(id);
		
	}
	/**
	 * 修改
	 */
	@Override
	public void updateGjj(Tb_accumulation_fund tb_acc) {
		accDao.updateGjj(tb_acc);
	}


}
