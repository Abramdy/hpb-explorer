package com.hpb.bc.mapper;

import com.hpb.bc.entity.ContractMethodInfo;
import com.hpb.bc.example.ContractMethodInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ContractMethodInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    long countByExample(ContractMethodInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    int deleteByExample(ContractMethodInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    int insert(ContractMethodInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    int insertSelective(ContractMethodInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    List<ContractMethodInfo> selectByExampleWithBLOBs(ContractMethodInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    List<ContractMethodInfo> selectByExample(ContractMethodInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    ContractMethodInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ContractMethodInfo record, @Param("example") ContractMethodInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") ContractMethodInfo record, @Param("example") ContractMethodInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ContractMethodInfo record, @Param("example") ContractMethodInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ContractMethodInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(ContractMethodInfo record);


    ContractMethodInfo selectByContractAndMethod(@Param("contractAddr") String contractAddr, @Param("methodId") String methodId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_method_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ContractMethodInfo record);
}