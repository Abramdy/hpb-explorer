package com.hpb.bc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class HpbTransactionAmountRecord extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_transaction_amount_record.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_transaction_amount_record.block_number
     *
     * @mbg.generated
     */
    private Long blockNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_transaction_amount_record.from_amount
     *
     * @mbg.generated
     */
    private BigDecimal fromAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_transaction_amount_record.to_amount
     *
     * @mbg.generated
     */
    private BigDecimal toAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_transaction_amount_record.create_timestamp
     *
     * @mbg.generated
     */
    private Date createTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_transaction_amount_record.update_timestamp
     *
     * @mbg.generated
     */
    private Date updateTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_transaction_amount_record.address
     *
     * @return the value of hpb_transaction_amount_record.address
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_transaction_amount_record.address
     *
     * @param address the value for hpb_transaction_amount_record.address
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_transaction_amount_record.block_number
     *
     * @return the value of hpb_transaction_amount_record.block_number
     * @mbg.generated
     */
    public Long getBlockNumber() {
        return blockNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_transaction_amount_record.block_number
     *
     * @param blockNumber the value for hpb_transaction_amount_record.block_number
     * @mbg.generated
     */
    public void setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_transaction_amount_record.from_amount
     *
     * @return the value of hpb_transaction_amount_record.from_amount
     * @mbg.generated
     */
    public BigDecimal getFromAmount() {
        return fromAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_transaction_amount_record.from_amount
     *
     * @param fromAmount the value for hpb_transaction_amount_record.from_amount
     * @mbg.generated
     */
    public void setFromAmount(BigDecimal fromAmount) {
        this.fromAmount = fromAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_transaction_amount_record.to_amount
     *
     * @return the value of hpb_transaction_amount_record.to_amount
     * @mbg.generated
     */
    public BigDecimal getToAmount() {
        return toAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_transaction_amount_record.to_amount
     *
     * @param toAmount the value for hpb_transaction_amount_record.to_amount
     * @mbg.generated
     */
    public void setToAmount(BigDecimal toAmount) {
        this.toAmount = toAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_transaction_amount_record.create_timestamp
     *
     * @return the value of hpb_transaction_amount_record.create_timestamp
     * @mbg.generated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_transaction_amount_record.create_timestamp
     *
     * @param createTimestamp the value for hpb_transaction_amount_record.create_timestamp
     * @mbg.generated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_transaction_amount_record.update_timestamp
     *
     * @return the value of hpb_transaction_amount_record.update_timestamp
     * @mbg.generated
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_transaction_amount_record.update_timestamp
     *
     * @param updateTimestamp the value for hpb_transaction_amount_record.update_timestamp
     * @mbg.generated
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hpb_transaction_amount_record
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
        HpbTransactionAmountRecord other = (HpbTransactionAmountRecord) that;
        return (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
                && (this.getBlockNumber() == null ? other.getBlockNumber() == null : this.getBlockNumber().equals(other.getBlockNumber()))
                && (this.getFromAmount() == null ? other.getFromAmount() == null : this.getFromAmount().equals(other.getFromAmount()))
                && (this.getToAmount() == null ? other.getToAmount() == null : this.getToAmount().equals(other.getToAmount()))
                && (this.getCreateTimestamp() == null ? other.getCreateTimestamp() == null : this.getCreateTimestamp().equals(other.getCreateTimestamp()))
                && (this.getUpdateTimestamp() == null ? other.getUpdateTimestamp() == null : this.getUpdateTimestamp().equals(other.getUpdateTimestamp()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hpb_transaction_amount_record
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getBlockNumber() == null) ? 0 : getBlockNumber().hashCode());
        result = prime * result + ((getFromAmount() == null) ? 0 : getFromAmount().hashCode());
        result = prime * result + ((getToAmount() == null) ? 0 : getToAmount().hashCode());
        result = prime * result + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        result = prime * result + ((getUpdateTimestamp() == null) ? 0 : getUpdateTimestamp().hashCode());
        return result;
    }
}