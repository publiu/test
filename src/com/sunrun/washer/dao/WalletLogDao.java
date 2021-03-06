package com.sunrun.washer.dao;
import java.util.List;

import com.jeecms.common.page.Pagination;
import com.sunrun.washer.entity.WalletLog;
import com.sunrun.washer.model.WalletLogModel;
/**
 * 文 件 名 : 消费日志管理
 * 创 建 人： 金明明
 * 日 期：2017-8-6
 * 修 改 人： 
 * 日 期： 
 * 描 述：消费日志管理 Dao层
 */
public interface WalletLogDao {
	/**
	 * 查询钱包消费日志列表
	 * @param walletLogModel 钱包消费日志查询条件
	 * @param pageNo 当前页
	 * @param pageSize 每页数据量
	 * @return
	 */
	public Pagination queryWalletLogByModel(WalletLogModel walletLogModel, Integer pageNo, Integer pageSize);

	/**
	 * 查询钱包消费日志列表(不分页)
	 * @param walletLogModel 钱包消费日志查询条件
	 * @return
	 */
	public List<WalletLog> queryWalletLogListByModel(WalletLogModel walletLogModel);

	
	/**
	 * 保存钱包消费日志
	 * @param 钱包消费日志
	 * @return
	 */
	public WalletLog save(WalletLog walletLog);
	
    /**
     * 根据Id获取实体
     * @param 钱包消费日志Id
     * @return
     */
	public WalletLog findById(Integer walletLogId);
	
}

