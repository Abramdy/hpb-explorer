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

public class ContractErcStandardInfo extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.token_symbol
     *
     * @mbg.generated
     */
    private String tokenSymbol;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.token_symbol_image_url
     *
     * @mbg.generated
     */
    private String tokenSymbolImageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.token_name
     *
     * @mbg.generated
     */
    private String tokenName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.decimals
     *
     * @mbg.generated
     */
    private Long decimals;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.deploy_tx_hash
     *
     * @mbg.generated
     */
    private String deployTxHash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.contract_creater
     *
     * @mbg.generated
     */
    private String contractCreater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.contract_address
     *
     * @mbg.generated
     */
    private String contractAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.token_total_supply
     *
     * @mbg.generated
     */
    private Long tokenTotalSupply;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.contract_type
     *
     * @mbg.generated
     */
    private String contractType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.verified_status
     *
     * @mbg.generated
     */
    private String verifiedStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.price
     *
     * @mbg.generated
     */
    private String price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.change_rate
     *
     * @mbg.generated
     */
    private String changeRate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.volume_24h
     *
     * @mbg.generated
     */
    private String volume24h;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.market_cap
     *
     * @mbg.generated
     */
    private BigDecimal marketCap;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.holders
     *
     * @mbg.generated
     */
    private Integer holders;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.transfers_num
     *
     * @mbg.generated
     */
    private Integer transfersNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.create_timestamp
     *
     * @mbg.generated
     */
    private Date createTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_erc_standard_info.update_timestamp
     *
     * @mbg.generated
     */
    private Date updateTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.id
     *
     * @return the value of contract_erc_standard_info.id
     *
     * @mbg.generated
     */
    /**
     * hpbBalance;
     */
    private BigDecimal hpbBalance;

    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.id
     *
     * @param id the value for contract_erc_standard_info.id
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.token_symbol
     *
     * @return the value of contract_erc_standard_info.token_symbol
     * @mbg.generated
     */
    public String getTokenSymbol() {
        return tokenSymbol;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.token_symbol
     *
     * @param tokenSymbol the value for contract_erc_standard_info.token_symbol
     * @mbg.generated
     */
    public void setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol == null ? null : tokenSymbol.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.token_symbol_image_url
     *
     * @return the value of contract_erc_standard_info.token_symbol_image_url
     * @mbg.generated
     */
    public String getTokenSymbolImageUrl() {
        return tokenSymbolImageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.token_symbol_image_url
     *
     * @param tokenSymbolImageUrl the value for contract_erc_standard_info.token_symbol_image_url
     * @mbg.generated
     */
    public void setTokenSymbolImageUrl(String tokenSymbolImageUrl) {
        this.tokenSymbolImageUrl = tokenSymbolImageUrl == null ? null : tokenSymbolImageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.token_name
     *
     * @return the value of contract_erc_standard_info.token_name
     * @mbg.generated
     */
    public String getTokenName() {
        return tokenName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.token_name
     *
     * @param tokenName the value for contract_erc_standard_info.token_name
     * @mbg.generated
     */
    public void setTokenName(String tokenName) {
        this.tokenName = tokenName == null ? null : tokenName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.decimals
     *
     * @return the value of contract_erc_standard_info.decimals
     * @mbg.generated
     */
    public Long getDecimals() {
        return decimals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.decimals
     *
     * @param decimals the value for contract_erc_standard_info.decimals
     * @mbg.generated
     */
    public void setDecimals(Long decimals) {
        this.decimals = decimals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.deploy_tx_hash
     *
     * @return the value of contract_erc_standard_info.deploy_tx_hash
     * @mbg.generated
     */
    public String getDeployTxHash() {
        return deployTxHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.deploy_tx_hash
     *
     * @param deployTxHash the value for contract_erc_standard_info.deploy_tx_hash
     * @mbg.generated
     */
    public void setDeployTxHash(String deployTxHash) {
        this.deployTxHash = deployTxHash == null ? null : deployTxHash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.contract_creater
     *
     * @return the value of contract_erc_standard_info.contract_creater
     * @mbg.generated
     */
    public String getContractCreater() {
        return contractCreater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.contract_creater
     *
     * @param contractCreater the value for contract_erc_standard_info.contract_creater
     * @mbg.generated
     */
    public void setContractCreater(String contractCreater) {
        this.contractCreater = contractCreater == null ? null : contractCreater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.contract_address
     *
     * @return the value of contract_erc_standard_info.contract_address
     * @mbg.generated
     */
    public String getContractAddress() {
        return contractAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.contract_address
     *
     * @param contractAddress the value for contract_erc_standard_info.contract_address
     * @mbg.generated
     */
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress == null ? null : contractAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.token_total_supply
     *
     * @return the value of contract_erc_standard_info.token_total_supply
     * @mbg.generated
     */
    public Long getTokenTotalSupply() {
        return tokenTotalSupply;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.token_total_supply
     *
     * @param tokenTotalSupply the value for contract_erc_standard_info.token_total_supply
     * @mbg.generated
     */
    public void setTokenTotalSupply(Long tokenTotalSupply) {
        this.tokenTotalSupply = tokenTotalSupply;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.contract_type
     *
     * @return the value of contract_erc_standard_info.contract_type
     * @mbg.generated
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.contract_type
     *
     * @param contractType the value for contract_erc_standard_info.contract_type
     * @mbg.generated
     */
    public void setContractType(String contractType) {
        this.contractType = contractType == null ? null : contractType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.verified_status
     *
     * @return the value of contract_erc_standard_info.verified_status
     * @mbg.generated
     */
    public String getVerifiedStatus() {
        return verifiedStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.verified_status
     *
     * @param verifiedStatus the value for contract_erc_standard_info.verified_status
     * @mbg.generated
     */
    public void setVerifiedStatus(String verifiedStatus) {
        this.verifiedStatus = verifiedStatus == null ? null : verifiedStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.price
     *
     * @return the value of contract_erc_standard_info.price
     * @mbg.generated
     */
    public String getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.price
     *
     * @param price the value for contract_erc_standard_info.price
     * @mbg.generated
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.change_rate
     *
     * @return the value of contract_erc_standard_info.change_rate
     * @mbg.generated
     */
    public String getChangeRate() {
        return changeRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.change_rate
     *
     * @param changeRate the value for contract_erc_standard_info.change_rate
     * @mbg.generated
     */
    public void setChangeRate(String changeRate) {
        this.changeRate = changeRate == null ? null : changeRate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.volume_24h
     *
     * @return the value of contract_erc_standard_info.volume_24h
     * @mbg.generated
     */
    public String getVolume24h() {
        return volume24h;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.volume_24h
     *
     * @param volume24h the value for contract_erc_standard_info.volume_24h
     * @mbg.generated
     */
    public void setVolume24h(String volume24h) {
        this.volume24h = volume24h == null ? null : volume24h.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.market_cap
     *
     * @return the value of contract_erc_standard_info.market_cap
     * @mbg.generated
     */
    public BigDecimal getMarketCap() {
        return marketCap;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.market_cap
     *
     * @param marketCap the value for contract_erc_standard_info.market_cap
     * @mbg.generated
     */
    public void setMarketCap(BigDecimal marketCap) {
        this.marketCap = marketCap;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.holders
     *
     * @return the value of contract_erc_standard_info.holders
     * @mbg.generated
     */
    public Integer getHolders() {
        return holders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.holders
     *
     * @param holders the value for contract_erc_standard_info.holders
     * @mbg.generated
     */
    public void setHolders(Integer holders) {
        this.holders = holders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.transfers_num
     *
     * @return the value of contract_erc_standard_info.transfers_num
     * @mbg.generated
     */
    public Integer getTransfersNum() {
        return transfersNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.transfers_num
     *
     * @param transfersNum the value for contract_erc_standard_info.transfers_num
     * @mbg.generated
     */
    public void setTransfersNum(Integer transfersNum) {
        this.transfersNum = transfersNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.status
     *
     * @return the value of contract_erc_standard_info.status
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.status
     *
     * @param status the value for contract_erc_standard_info.status
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.create_timestamp
     *
     * @return the value of contract_erc_standard_info.create_timestamp
     * @mbg.generated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.create_timestamp
     *
     * @param createTimestamp the value for contract_erc_standard_info.create_timestamp
     * @mbg.generated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_erc_standard_info.update_timestamp
     *
     * @return the value of contract_erc_standard_info.update_timestamp
     * @mbg.generated
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_erc_standard_info.update_timestamp
     *
     * @param updateTimestamp the value for contract_erc_standard_info.update_timestamp
     * @mbg.generated
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public BigDecimal getHpbBalance() {
        return hpbBalance;
    }

    public void setHpbBalance(BigDecimal hpbBalance) {
        this.hpbBalance = hpbBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_standard_info
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
        ContractErcStandardInfo other = (ContractErcStandardInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getTokenSymbol() == null ? other.getTokenSymbol() == null : this.getTokenSymbol().equals(other.getTokenSymbol()))
                && (this.getTokenSymbolImageUrl() == null ? other.getTokenSymbolImageUrl() == null : this.getTokenSymbolImageUrl().equals(other.getTokenSymbolImageUrl()))
                && (this.getTokenName() == null ? other.getTokenName() == null : this.getTokenName().equals(other.getTokenName()))
                && (this.getDecimals() == null ? other.getDecimals() == null : this.getDecimals().equals(other.getDecimals()))
                && (this.getDeployTxHash() == null ? other.getDeployTxHash() == null : this.getDeployTxHash().equals(other.getDeployTxHash()))
                && (this.getContractCreater() == null ? other.getContractCreater() == null : this.getContractCreater().equals(other.getContractCreater()))
                && (this.getContractAddress() == null ? other.getContractAddress() == null : this.getContractAddress().equals(other.getContractAddress()))
                && (this.getTokenTotalSupply() == null ? other.getTokenTotalSupply() == null : this.getTokenTotalSupply().equals(other.getTokenTotalSupply()))
                && (this.getContractType() == null ? other.getContractType() == null : this.getContractType().equals(other.getContractType()))
                && (this.getVerifiedStatus() == null ? other.getVerifiedStatus() == null : this.getVerifiedStatus().equals(other.getVerifiedStatus()))
                && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
                && (this.getChangeRate() == null ? other.getChangeRate() == null : this.getChangeRate().equals(other.getChangeRate()))
                && (this.getVolume24h() == null ? other.getVolume24h() == null : this.getVolume24h().equals(other.getVolume24h()))
                && (this.getMarketCap() == null ? other.getMarketCap() == null : this.getMarketCap().equals(other.getMarketCap()))
                && (this.getHolders() == null ? other.getHolders() == null : this.getHolders().equals(other.getHolders()))
                && (this.getTransfersNum() == null ? other.getTransfersNum() == null : this.getTransfersNum().equals(other.getTransfersNum()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getCreateTimestamp() == null ? other.getCreateTimestamp() == null : this.getCreateTimestamp().equals(other.getCreateTimestamp()))
                && (this.getUpdateTimestamp() == null ? other.getUpdateTimestamp() == null : this.getUpdateTimestamp().equals(other.getUpdateTimestamp()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_erc_standard_info
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTokenSymbol() == null) ? 0 : getTokenSymbol().hashCode());
        result = prime * result + ((getTokenSymbolImageUrl() == null) ? 0 : getTokenSymbolImageUrl().hashCode());
        result = prime * result + ((getTokenName() == null) ? 0 : getTokenName().hashCode());
        result = prime * result + ((getDecimals() == null) ? 0 : getDecimals().hashCode());
        result = prime * result + ((getDeployTxHash() == null) ? 0 : getDeployTxHash().hashCode());
        result = prime * result + ((getContractCreater() == null) ? 0 : getContractCreater().hashCode());
        result = prime * result + ((getContractAddress() == null) ? 0 : getContractAddress().hashCode());
        result = prime * result + ((getTokenTotalSupply() == null) ? 0 : getTokenTotalSupply().hashCode());
        result = prime * result + ((getContractType() == null) ? 0 : getContractType().hashCode());
        result = prime * result + ((getVerifiedStatus() == null) ? 0 : getVerifiedStatus().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getChangeRate() == null) ? 0 : getChangeRate().hashCode());
        result = prime * result + ((getVolume24h() == null) ? 0 : getVolume24h().hashCode());
        result = prime * result + ((getMarketCap() == null) ? 0 : getMarketCap().hashCode());
        result = prime * result + ((getHolders() == null) ? 0 : getHolders().hashCode());
        result = prime * result + ((getTransfersNum() == null) ? 0 : getTransfersNum().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        result = prime * result + ((getUpdateTimestamp() == null) ? 0 : getUpdateTimestamp().hashCode());
        return result;
    }
}