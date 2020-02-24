package com.hpb.bc.mapper;

import com.hpb.bc.entity.StatTransactionAmountDaily;
import com.hpb.bc.example.StatTransactionAmountDailyExample;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StatTransactionAmountDailyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stat_transaction_amount_daily
     *
     * @mbg.generated
     */
    long countByExample(StatTransactionAmountDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stat_transaction_amount_daily
     *
     * @mbg.generated
     */
    int deleteByExample(StatTransactionAmountDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stat_transaction_amount_daily
     *
     * @mbg.generated
     */
    int insert(StatTransactionAmountDaily record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stat_transaction_amount_daily
     *
     * @mbg.generated
     */
    int insertSelective(StatTransactionAmountDaily record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stat_transaction_amount_daily
     *
     * @mbg.generated
     */
    List<StatTransactionAmountDaily> selectByExample(StatTransactionAmountDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stat_transaction_amount_daily
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") StatTransactionAmountDaily record, @Param("example") StatTransactionAmountDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stat_transaction_amount_daily
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") StatTransactionAmountDaily record, @Param("example") StatTransactionAmountDailyExample example);


    List<StatTransactionAmountDaily> selectStatTransactionAmountDailyBetweenStartTimeAndEndTime(@Param("startDateTime") Date startDateTime, @Param("endDateTime") Date endDateTime);
}