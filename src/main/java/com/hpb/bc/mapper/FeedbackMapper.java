package com.hpb.bc.mapper;

import com.hpb.bc.entity.Feedback;
import com.hpb.bc.example.FeedbackExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface FeedbackMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    long countByExample(FeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int deleteByExample(FeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int insert(Feedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int insertSelective(Feedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    List<Feedback> selectByExample(FeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    Feedback selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Feedback record, @Param("example") FeedbackExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Feedback record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table feedback
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Feedback record);
}