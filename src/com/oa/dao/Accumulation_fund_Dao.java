package com.oa.dao;
/**
 * 公积金接口类
 * @author 吴少钦
 *
 */

import java.util.List;
import java.util.Map;

import com.oa.entity.Tb_accumulation_fund;
import com.oa.entity.Tb_customer;

public interface Accumulation_fund_Dao {
	/**
	 * 查询出客户表的信息
	 * @return
	 */
	public  List<Tb_customer> customersBy();
	/**
	 * 查询出信息的总条数
	 * @return
	 */
	public Long GjjCount();
	
	/**
	 * 查询所有
	 * @param hql
	 * @param pageNow
	 * @param pageSize
	 * @param （模糊查询的条件）
	 * @return
	 */
	public List<Object> SelectAccumulation_fundAll(String idCard,String accountNo,Integer pageNow,Integer pageSize);
	
	
	 /**
     * 通过id来查询到值来删除
     * @param id
     */
    public void DeleteTb_accumulation_fundById(Integer id);
    
    /**
     * 添加公积金
     * @param acc_fund
     */
    public void AddTb_accumulation_fund(Tb_accumulation_fund acc_fund);
    /**
     * 通过id查询得到值后修改
     * @param id
     * @return
     */
	public Tb_accumulation_fund selectAccumulation_fundById(Integer id);
	/**
	 * 得到值以后开始修改
	 * @param tb_acc
	 */
	public void updateGjj(Tb_accumulation_fund tb_acc);
	
}
