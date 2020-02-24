package com.hpb.bc.mapper;

import com.hpb.bc.entity.ContractErcProfileSummaryApprove;
import com.hpb.bc.example.ContractErcProfileSummaryApproveExample;
import java.util.List;

import com.hpb.bc.model.ContractErcProfileSummaryAproveModel;
import org.apache.ibatis.annotations.Param;

public interface ContractErcProfileSummaryApproveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    long countByExample(ContractErcProfileSummaryApproveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    int deleteByExample(ContractErcProfileSummaryApproveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    int insert(ContractErcProfileSummaryApprove record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    int insertSelective(ContractErcProfileSummaryApprove record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    List<ContractErcProfileSummaryApprove> selectByExampleWithBLOBs(ContractErcProfileSummaryApproveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    List<ContractErcProfileSummaryApprove> selectByExample(ContractErcProfileSummaryApproveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    ContractErcProfileSummaryApprove selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ContractErcProfileSummaryApprove record, @Param("example") ContractErcProfileSummaryApproveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") ContractErcProfileSummaryApprove record, @Param("example") ContractErcProfileSummaryApproveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ContractErcProfileSummaryApprove record, @Param("example") ContractErcProfileSummaryApproveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ContractErcProfileSummaryApprove record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(ContractErcProfileSummaryApprove record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_profile_summary_approve
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ContractErcProfileSummaryApprove record);



    void saveMoreInfo(ContractErcProfileSummaryAproveModel.ContractErcProfileSummaryInner formContent);

    int updateMoreInfo(ContractErcProfileSummaryAproveModel.ContractErcProfileSummaryInner formContent);

    // ContractErcProfileSummaryApproveMapper

    ContractErcProfileSummaryApprove selectMoreInfoByAddressAndApproveStatus(@Param("contactAddress") String contactAddress,@Param("approveStatus") String approveStatus);
}