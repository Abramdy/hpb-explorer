/*
 * Copyright 2020 HPB Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hpb.bc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class HpbNodeRewardRecord extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.node_address
     *
     * @mbg.generated
     */
    private String nodeAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.node_name
     *
     * @mbg.generated
     */
    private String nodeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.total_vote_amount
     *
     * @mbg.generated
     */
    private String totalVoteAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.balance
     *
     * @mbg.generated
     */
    private BigDecimal balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.node_type
     *
     * @mbg.generated
     */
    private String nodeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.node_mint_reward_amount
     *
     * @mbg.generated
     */
    private BigDecimal nodeMintRewardAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.node_vote_reward_amount
     *
     * @mbg.generated
     */
    private BigDecimal nodeVoteRewardAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.node_total_reward_amount
     *
     * @mbg.generated
     */
    private BigDecimal nodeTotalRewardAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.reward_vote_percent_rate
     *
     * @mbg.generated
     */
    private BigDecimal rewardVotePercentRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.block_number
     *
     * @mbg.generated
     */
    private Long blockNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.block_hash
     *
     * @mbg.generated
     */
    private String blockHash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.block_timestamp
     *
     * @mbg.generated
     */
    private Long blockTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.create_timestamp
     *
     * @mbg.generated
     */
    private Date createTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_node_reward_record.update_timestamp
     *
     * @mbg.generated
     */
    private Date updateTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.node_address
     *
     * @return the value of hpb_node_reward_record.node_address
     *
     * @mbg.generated
     */
    public String getNodeAddress() {
        return nodeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.node_address
     *
     * @param nodeAddress the value for hpb_node_reward_record.node_address
     *
     * @mbg.generated
     */
    public void setNodeAddress(String nodeAddress) {
        this.nodeAddress = nodeAddress == null ? null : nodeAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.node_name
     *
     * @return the value of hpb_node_reward_record.node_name
     *
     * @mbg.generated
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.node_name
     *
     * @param nodeName the value for hpb_node_reward_record.node_name
     *
     * @mbg.generated
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.total_vote_amount
     *
     * @return the value of hpb_node_reward_record.total_vote_amount
     *
     * @mbg.generated
     */
    public String getTotalVoteAmount() {
        return totalVoteAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.total_vote_amount
     *
     * @param totalVoteAmount the value for hpb_node_reward_record.total_vote_amount
     *
     * @mbg.generated
     */
    public void setTotalVoteAmount(String totalVoteAmount) {
        this.totalVoteAmount = totalVoteAmount == null ? null : totalVoteAmount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.balance
     *
     * @return the value of hpb_node_reward_record.balance
     *
     * @mbg.generated
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.balance
     *
     * @param balance the value for hpb_node_reward_record.balance
     *
     * @mbg.generated
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.node_type
     *
     * @return the value of hpb_node_reward_record.node_type
     *
     * @mbg.generated
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.node_type
     *
     * @param nodeType the value for hpb_node_reward_record.node_type
     *
     * @mbg.generated
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.node_mint_reward_amount
     *
     * @return the value of hpb_node_reward_record.node_mint_reward_amount
     *
     * @mbg.generated
     */
    public BigDecimal getNodeMintRewardAmount() {
        return nodeMintRewardAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.node_mint_reward_amount
     *
     * @param nodeMintRewardAmount the value for hpb_node_reward_record.node_mint_reward_amount
     *
     * @mbg.generated
     */
    public void setNodeMintRewardAmount(BigDecimal nodeMintRewardAmount) {
        this.nodeMintRewardAmount = nodeMintRewardAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.node_vote_reward_amount
     *
     * @return the value of hpb_node_reward_record.node_vote_reward_amount
     *
     * @mbg.generated
     */
    public BigDecimal getNodeVoteRewardAmount() {
        return nodeVoteRewardAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.node_vote_reward_amount
     *
     * @param nodeVoteRewardAmount the value for hpb_node_reward_record.node_vote_reward_amount
     *
     * @mbg.generated
     */
    public void setNodeVoteRewardAmount(BigDecimal nodeVoteRewardAmount) {
        this.nodeVoteRewardAmount = nodeVoteRewardAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.node_total_reward_amount
     *
     * @return the value of hpb_node_reward_record.node_total_reward_amount
     *
     * @mbg.generated
     */
    public BigDecimal getNodeTotalRewardAmount() {
        return nodeTotalRewardAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.node_total_reward_amount
     *
     * @param nodeTotalRewardAmount the value for hpb_node_reward_record.node_total_reward_amount
     *
     * @mbg.generated
     */
    public void setNodeTotalRewardAmount(BigDecimal nodeTotalRewardAmount) {
        this.nodeTotalRewardAmount = nodeTotalRewardAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.reward_vote_percent_rate
     *
     * @return the value of hpb_node_reward_record.reward_vote_percent_rate
     *
     * @mbg.generated
     */
    public BigDecimal getRewardVotePercentRate() {
        return rewardVotePercentRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.reward_vote_percent_rate
     *
     * @param rewardVotePercentRate the value for hpb_node_reward_record.reward_vote_percent_rate
     *
     * @mbg.generated
     */
    public void setRewardVotePercentRate(BigDecimal rewardVotePercentRate) {
        this.rewardVotePercentRate = rewardVotePercentRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.block_number
     *
     * @return the value of hpb_node_reward_record.block_number
     *
     * @mbg.generated
     */
    public Long getBlockNumber() {
        return blockNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.block_number
     *
     * @param blockNumber the value for hpb_node_reward_record.block_number
     *
     * @mbg.generated
     */
    public void setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.block_hash
     *
     * @return the value of hpb_node_reward_record.block_hash
     *
     * @mbg.generated
     */
    public String getBlockHash() {
        return blockHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.block_hash
     *
     * @param blockHash the value for hpb_node_reward_record.block_hash
     *
     * @mbg.generated
     */
    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash == null ? null : blockHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.block_timestamp
     *
     * @return the value of hpb_node_reward_record.block_timestamp
     *
     * @mbg.generated
     */
    public Long getBlockTimestamp() {
        return blockTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.block_timestamp
     *
     * @param blockTimestamp the value for hpb_node_reward_record.block_timestamp
     *
     * @mbg.generated
     */
    public void setBlockTimestamp(Long blockTimestamp) {
        this.blockTimestamp = blockTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.create_timestamp
     *
     * @return the value of hpb_node_reward_record.create_timestamp
     *
     * @mbg.generated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.create_timestamp
     *
     * @param createTimestamp the value for hpb_node_reward_record.create_timestamp
     *
     * @mbg.generated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_node_reward_record.update_timestamp
     *
     * @return the value of hpb_node_reward_record.update_timestamp
     *
     * @mbg.generated
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_node_reward_record.update_timestamp
     *
     * @param updateTimestamp the value for hpb_node_reward_record.update_timestamp
     *
     * @mbg.generated
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hpb_node_reward_record
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
        HpbNodeRewardRecord other = (HpbNodeRewardRecord) that;
        return (this.getNodeAddress() == null ? other.getNodeAddress() == null : this.getNodeAddress().equals(other.getNodeAddress()))
            && (this.getNodeName() == null ? other.getNodeName() == null : this.getNodeName().equals(other.getNodeName()))
            && (this.getTotalVoteAmount() == null ? other.getTotalVoteAmount() == null : this.getTotalVoteAmount().equals(other.getTotalVoteAmount()))
            && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
            && (this.getNodeType() == null ? other.getNodeType() == null : this.getNodeType().equals(other.getNodeType()))
            && (this.getNodeMintRewardAmount() == null ? other.getNodeMintRewardAmount() == null : this.getNodeMintRewardAmount().equals(other.getNodeMintRewardAmount()))
            && (this.getNodeVoteRewardAmount() == null ? other.getNodeVoteRewardAmount() == null : this.getNodeVoteRewardAmount().equals(other.getNodeVoteRewardAmount()))
            && (this.getNodeTotalRewardAmount() == null ? other.getNodeTotalRewardAmount() == null : this.getNodeTotalRewardAmount().equals(other.getNodeTotalRewardAmount()))
            && (this.getRewardVotePercentRate() == null ? other.getRewardVotePercentRate() == null : this.getRewardVotePercentRate().equals(other.getRewardVotePercentRate()))
            && (this.getBlockNumber() == null ? other.getBlockNumber() == null : this.getBlockNumber().equals(other.getBlockNumber()))
            && (this.getBlockHash() == null ? other.getBlockHash() == null : this.getBlockHash().equals(other.getBlockHash()))
            && (this.getBlockTimestamp() == null ? other.getBlockTimestamp() == null : this.getBlockTimestamp().equals(other.getBlockTimestamp()))
            && (this.getCreateTimestamp() == null ? other.getCreateTimestamp() == null : this.getCreateTimestamp().equals(other.getCreateTimestamp()))
            && (this.getUpdateTimestamp() == null ? other.getUpdateTimestamp() == null : this.getUpdateTimestamp().equals(other.getUpdateTimestamp()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hpb_node_reward_record
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNodeAddress() == null) ? 0 : getNodeAddress().hashCode());
        result = prime * result + ((getNodeName() == null) ? 0 : getNodeName().hashCode());
        result = prime * result + ((getTotalVoteAmount() == null) ? 0 : getTotalVoteAmount().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        result = prime * result + ((getNodeMintRewardAmount() == null) ? 0 : getNodeMintRewardAmount().hashCode());
        result = prime * result + ((getNodeVoteRewardAmount() == null) ? 0 : getNodeVoteRewardAmount().hashCode());
        result = prime * result + ((getNodeTotalRewardAmount() == null) ? 0 : getNodeTotalRewardAmount().hashCode());
        result = prime * result + ((getRewardVotePercentRate() == null) ? 0 : getRewardVotePercentRate().hashCode());
        result = prime * result + ((getBlockNumber() == null) ? 0 : getBlockNumber().hashCode());
        result = prime * result + ((getBlockHash() == null) ? 0 : getBlockHash().hashCode());
        result = prime * result + ((getBlockTimestamp() == null) ? 0 : getBlockTimestamp().hashCode());
        result = prime * result + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        result = prime * result + ((getUpdateTimestamp() == null) ? 0 : getUpdateTimestamp().hashCode());
        return result;
    }
}