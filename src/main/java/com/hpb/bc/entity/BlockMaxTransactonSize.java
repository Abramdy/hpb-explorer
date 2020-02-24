package com.hpb.bc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BlockMaxTransactonSize extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block_max_transacton_size.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block_max_transacton_size.block_number
     *
     * @mbg.generated
     */
    private Long blockNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block_max_transacton_size.max_size
     *
     * @mbg.generated
     */
    private BigDecimal maxSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block_max_transacton_size.create_timestamp
     *
     * @mbg.generated
     */
    private Date createTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block_max_transacton_size.update_timestamp
     *
     * @mbg.generated
     */
    private Date updateTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column block_max_transacton_size.id
     *
     * @return the value of block_max_transacton_size.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column block_max_transacton_size.id
     *
     * @param id the value for block_max_transacton_size.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column block_max_transacton_size.block_number
     *
     * @return the value of block_max_transacton_size.block_number
     * @mbg.generated
     */
    public Long getBlockNumber() {
        return blockNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column block_max_transacton_size.block_number
     *
     * @param blockNumber the value for block_max_transacton_size.block_number
     * @mbg.generated
     */
    public void setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column block_max_transacton_size.max_size
     *
     * @return the value of block_max_transacton_size.max_size
     * @mbg.generated
     */
    public BigDecimal getMaxSize() {
        return maxSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column block_max_transacton_size.max_size
     *
     * @param maxSize the value for block_max_transacton_size.max_size
     * @mbg.generated
     */
    public void setMaxSize(BigDecimal maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column block_max_transacton_size.create_timestamp
     *
     * @return the value of block_max_transacton_size.create_timestamp
     * @mbg.generated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column block_max_transacton_size.create_timestamp
     *
     * @param createTimestamp the value for block_max_transacton_size.create_timestamp
     * @mbg.generated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column block_max_transacton_size.update_timestamp
     *
     * @return the value of block_max_transacton_size.update_timestamp
     * @mbg.generated
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column block_max_transacton_size.update_timestamp
     *
     * @param updateTimestamp the value for block_max_transacton_size.update_timestamp
     * @mbg.generated
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table block_max_transacton_size
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BlockMaxTransactonSize other = (BlockMaxTransactonSize) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getBlockNumber() == null ? other.getBlockNumber() == null : this.getBlockNumber().equals(other.getBlockNumber()))
                && (this.getMaxSize() == null ? other.getMaxSize() == null : this.getMaxSize().equals(other.getMaxSize()))
                && (this.getCreateTimestamp() == null ? other.getCreateTimestamp() == null : this.getCreateTimestamp().equals(other.getCreateTimestamp()))
                && (this.getUpdateTimestamp() == null ? other.getUpdateTimestamp() == null : this.getUpdateTimestamp().equals(other.getUpdateTimestamp()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table block_max_transacton_size
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBlockNumber() == null) ? 0 : getBlockNumber().hashCode());
        result = prime * result + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        result = prime * result + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        result = prime * result + ((getUpdateTimestamp() == null) ? 0 : getUpdateTimestamp().hashCode());
        return result;
    }
}