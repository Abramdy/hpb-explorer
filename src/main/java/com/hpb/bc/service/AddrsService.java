package com.hpb.bc.service;

import com.github.pagehelper.PageInfo;
import com.hpb.bc.entity.Addrs;
import com.hpb.bc.entity.result.Result;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

/***
 * 地址服务
 */
public interface AddrsService {

    /***
     *  查询地址信息
     * @param  addrs;
     * @param  pageNum
     * @param  pageSize
     */
    public Result<PageInfo<Addrs>> getPageAddrs(Addrs addrs, int pageNum, int pageSize) throws Exception;

    /***
     *  根据address 查询Addrs
     * @param  address 账号列表；
     */

    Addrs getAddrsByAddress(String address);

    /***
     *  根据address 查询Addrs 详情
     * @param  address 账号列表；
     */
    Map getAddrsDetailInfo(String address);


    int getAddrCount();

    /**
     * 账户预览
     */
    Map<String, Object> getAddressOverview();

    /**
     * 查询转出金额；
     */
    BigDecimal queryTxAmountByFromAccount(String address);

    /**
     * 查询转入金额；
     */
    BigDecimal queryTxAmountByToAccount(String address);


    boolean checkContractAddress(String contractAddress);


    Map<String, Object> checkErcContractAddress(String contractAddress);


    Result<PageInfo<Addrs>> getPageContractAddrs(Addrs addrs, int pageNum, int pageSize);
}
