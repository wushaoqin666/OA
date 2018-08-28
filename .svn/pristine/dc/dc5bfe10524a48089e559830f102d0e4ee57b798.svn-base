package com.oa.service;
/**
 * 公积金业务逻辑层接口
 * @author 吴少钦
 *
 */

import java.util.List;

import com.oa.entity.Tb_accumulation_fund;
import com.oa.entity.Tb_customer;
import com.oa.utils.Page;

public interface Accumulation_fund_Service {
	/**
	 * 查询出客户信息
	 * @return
	 */
	public  List<Tb_customer> customersBy();
	/**
	 * 模糊查询公积金信息表和用户表中的用户名
	 * @param now
	 * @param size
	 * @param idCard          模糊查询条件
	 * @param accountno	模糊查询条件
	 * @return
	 */
	public Page<Tb_accumulation_fund> accumulation_fundSelect(String now,String size,String idCard,String accountNo);
	
	 /**
     * 通过id来查询到值来删除
     * @param id
     */
    public void DeleteTb_accumulation_fundById(Integer id);
    /**
     * 添加
     * @param acc_fund
     * @param customer
     */
    public void AddTb_accumulation_fund(Tb_accumulation_fund acc_fund);
    
    /**
     * 通过id查询到得到的值
     * @param id
     * @return
     */
    public Tb_accumulation_fund selectTb_accumulation_fundById(Integer id);
    
    /**
	 * 得到值以后开始修改
	 * @param tb_acc  一组数据
	 */
	public void updateGjj(Tb_accumulation_fund tb_acc);
}
