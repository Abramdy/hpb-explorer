package com.hpb.bc.entity;

import java.util.Date;

public class HpbCampaignPeriodVoteResult extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_campaign_period_vote_result.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_campaign_period_vote_result.node_name
     *
     * @mbg.generated
     */
    private String nodeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_campaign_period_vote_result.node_address
     *
     * @mbg.generated
     */
    private String nodeAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_campaign_period_vote_result.vote_round
     *
     * @mbg.generated
     */
    private Integer voteRound;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_campaign_period_vote_result.rank_order
     *
     * @mbg.generated
     */
    private Integer rankOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_campaign_period_vote_result.vote_total_amount
     *
     * @mbg.generated
     */
    private String voteTotalAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_campaign_period_vote_result.create_timestamp
     *
     * @mbg.generated
     */
    private Date createTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_campaign_period_vote_result.id
     *
     * @return the value of hpb_campaign_period_vote_result.id
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_campaign_period_vote_result.id
     *
     * @param id the value for hpb_campaign_period_vote_result.id
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_campaign_period_vote_result.node_name
     *
     * @return the value of hpb_campaign_period_vote_result.node_name
     * @mbg.generated
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_campaign_period_vote_result.node_name
     *
     * @param nodeName the value for hpb_campaign_period_vote_result.node_name
     * @mbg.generated
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_campaign_period_vote_result.node_address
     *
     * @return the value of hpb_campaign_period_vote_result.node_address
     * @mbg.generated
     */
    public String getNodeAddress() {
        return nodeAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_campaign_period_vote_result.node_address
     *
     * @param nodeAddress the value for hpb_campaign_period_vote_result.node_address
     * @mbg.generated
     */
    public void setNodeAddress(String nodeAddress) {
        this.nodeAddress = nodeAddress == null ? null : nodeAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_campaign_period_vote_result.vote_round
     *
     * @return the value of hpb_campaign_period_vote_result.vote_round
     * @mbg.generated
     */
    public Integer getVoteRound() {
        return voteRound;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_campaign_period_vote_result.vote_round
     *
     * @param voteRound the value for hpb_campaign_period_vote_result.vote_round
     * @mbg.generated
     */
    public void setVoteRound(Integer voteRound) {
        this.voteRound = voteRound;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_campaign_period_vote_result.rank_order
     *
     * @return the value of hpb_campaign_period_vote_result.rank_order
     * @mbg.generated
     */
    public Integer getRankOrder() {
        return rankOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_campaign_period_vote_result.rank_order
     *
     * @param rankOrder the value for hpb_campaign_period_vote_result.rank_order
     * @mbg.generated
     */
    public void setRankOrder(Integer rankOrder) {
        this.rankOrder = rankOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_campaign_period_vote_result.vote_total_amount
     *
     * @return the value of hpb_campaign_period_vote_result.vote_total_amount
     * @mbg.generated
     */
    public String getVoteTotalAmount() {
        return voteTotalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_campaign_period_vote_result.vote_total_amount
     *
     * @param voteTotalAmount the value for hpb_campaign_period_vote_result.vote_total_amount
     * @mbg.generated
     */
    public void setVoteTotalAmount(String voteTotalAmount) {
        this.voteTotalAmount = voteTotalAmount == null ? null : voteTotalAmount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_campaign_period_vote_result.create_timestamp
     *
     * @return the value of hpb_campaign_period_vote_result.create_timestamp
     * @mbg.generated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_campaign_period_vote_result.create_timestamp
     *
     * @param createTimestamp the value for hpb_campaign_period_vote_result.create_timestamp
     * @mbg.generated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hpb_campaign_period_vote_result
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
        HpbCampaignPeriodVoteResult other = (HpbCampaignPeriodVoteResult) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getNodeName() == null ? other.getNodeName() == null : this.getNodeName().equals(other.getNodeName()))
                && (this.getNodeAddress() == null ? other.getNodeAddress() == null : this.getNodeAddress().equals(other.getNodeAddress()))
                && (this.getVoteRound() == null ? other.getVoteRound() == null : this.getVoteRound().equals(other.getVoteRound()))
                && (this.getRankOrder() == null ? other.getRankOrder() == null : this.getRankOrder().equals(other.getRankOrder()))
                && (this.getVoteTotalAmount() == null ? other.getVoteTotalAmount() == null : this.getVoteTotalAmount().equals(other.getVoteTotalAmount()))
                && (this.getCreateTimestamp() == null ? other.getCreateTimestamp() == null : this.getCreateTimestamp().equals(other.getCreateTimestamp()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hpb_campaign_period_vote_result
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNodeName() == null) ? 0 : getNodeName().hashCode());
        result = prime * result + ((getNodeAddress() == null) ? 0 : getNodeAddress().hashCode());
        result = prime * result + ((getVoteRound() == null) ? 0 : getVoteRound().hashCode());
        result = prime * result + ((getRankOrder() == null) ? 0 : getRankOrder().hashCode());
        result = prime * result + ((getVoteTotalAmount() == null) ? 0 : getVoteTotalAmount().hashCode());
        result = prime * result + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        return result;
    }
}