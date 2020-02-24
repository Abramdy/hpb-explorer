package com.hpb.bc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ContractInfo extends BaseEntity {
    private static final long serialVersionUID = 2240170536035632810L;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_info.contract_addr
     *
     * @mbg.generated
     */
    private String contractAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_info.contract_creater
     *
     * @mbg.generated
     */
    private String contractCreater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_info.contract_name
     *
     * @mbg.generated
     */
    private String contractName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_info.contract_src
     *
     * @mbg.generated
     */
    private String contractSrc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_info.contract_abi
     *
     * @mbg.generated
     */
    private String contractAbi;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_info.contract_bin
     *
     * @mbg.generated
     */
    private String contractBin;

    private String contractType;

    private String optimizeFlag;

    private BigDecimal balance;

    private Long txCount;

    private String verifiedStatus;

    private String dappUrl;

    private Long miscSettingRuns;

    private String hvmVersion;

    private String compilerType;

    private String compilerVersion;

    private Date createTimestamp;


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_info.contract_addr
     *
     * @return the value of contract_info.contract_addr
     * @mbg.generated
     */
    public String getContractAddr() {
        return contractAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_info.contract_addr
     *
     * @param contractAddr the value for contract_info.contract_addr
     * @mbg.generated
     */
    public void setContractAddr(String contractAddr) {
        this.contractAddr = contractAddr == null ? null : contractAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_info.contract_creater
     *
     * @return the value of contract_info.contract_creater
     * @mbg.generated
     */
    public String getContractCreater() {
        return contractCreater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_info.contract_creater
     *
     * @param contractCreater the value for contract_info.contract_creater
     * @mbg.generated
     */
    public void setContractCreater(String contractCreater) {
        this.contractCreater = contractCreater == null ? null : contractCreater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_info.contract_name
     *
     * @return the value of contract_info.contract_name
     * @mbg.generated
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_info.contract_name
     *
     * @param contractName the value for contract_info.contract_name
     * @mbg.generated
     */
    public void setContractName(String contractName) {
        this.contractName = contractName == null ? null : contractName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_info.contract_src
     *
     * @return the value of contract_info.contract_src
     * @mbg.generated
     */
    public String getContractSrc() {
        return contractSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_info.contract_src
     *
     * @param contractSrc the value for contract_info.contract_src
     * @mbg.generated
     */
    public void setContractSrc(String contractSrc) {
        this.contractSrc = contractSrc == null ? null : contractSrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_info.contract_abi
     *
     * @return the value of contract_info.contract_abi
     * @mbg.generated
     */
    public String getContractAbi() {
        return contractAbi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_info.contract_abi
     *
     * @param contractAbi the value for contract_info.contract_abi
     * @mbg.generated
     */
    public void setContractAbi(String contractAbi) {
        this.contractAbi = contractAbi == null ? null : contractAbi.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_info.contract_bin
     *
     * @return the value of contract_info.contract_bin
     * @mbg.generated
     */
    public String getContractBin() {
        return contractBin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_info.contract_bin
     *
     * @param contractBin the value for contract_info.contract_bin
     * @mbg.generated
     */
    public void setContractBin(String contractBin) {
        this.contractBin = contractBin == null ? null : contractBin.trim();
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getOptimizeFlag() {
        return optimizeFlag;
    }

    public void setOptimizeFlag(String optimizeFlag) {
        this.optimizeFlag = optimizeFlag;
    }

    public Long getMiscSettingRuns() {
        return miscSettingRuns;
    }

    public void setMiscSettingRuns(Long miscSettingRuns) {
        this.miscSettingRuns = miscSettingRuns;
    }

    public String getHvmVersion() {
        return hvmVersion;
    }

    public void setHvmVersion(String hvmVersion) {
        this.hvmVersion = hvmVersion;
    }

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Long getTxCount() {
        return txCount;
    }

    public void setTxCount(Long txCount) {
        this.txCount = txCount;
    }

    public String getVerifiedStatus() {
        return verifiedStatus;
    }

    public void setVerifiedStatus(String verifiedStatus) {
        this.verifiedStatus = verifiedStatus;
    }

    public String getDappUrl() {
        return dappUrl;
    }

    public void setDappUrl(String dappUrl) {
        this.dappUrl = dappUrl;
    }

    public String getCompilerType() {
        return compilerType;
    }

    public void setCompilerType(String compilerType) {
        this.compilerType = compilerType;
    }

    public String getCompilerVersion() {
        return compilerVersion;
    }

    public void setCompilerVersion(String compilerVersion) {
        this.compilerVersion = compilerVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_info
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
        ContractInfo other = (ContractInfo) that;
        return (this.getContractAddr() == null ? other.getContractAddr() == null : this.getContractAddr().equals(other.getContractAddr()))
                && (this.getContractCreater() == null ? other.getContractCreater() == null : this.getContractCreater().equals(other.getContractCreater()))
                && (this.getContractName() == null ? other.getContractName() == null : this.getContractName().equals(other.getContractName()))
                && (this.getContractSrc() == null ? other.getContractSrc() == null : this.getContractSrc().equals(other.getContractSrc()))
                && (this.getContractAbi() == null ? other.getContractAbi() == null : this.getContractAbi().equals(other.getContractAbi()))
                && (this.getContractBin() == null ? other.getContractBin() == null : this.getContractBin().equals(other.getContractBin()))
                && (this.getContractType() == null ? other.getContractType() == null : this.getContractType().equals(other.getContractType()))
                && (this.getOptimizeFlag() == null ? other.getOptimizeFlag() == null : this.getOptimizeFlag().equals(other.getOptimizeFlag()))

                && (this.getBalance() == null ? other.getBalance() == null : this.getBalance().equals(other.getBalance()))
                && (this.getVerifiedStatus() == null ? other.getVerifiedStatus() == null : this.getVerifiedStatus().equals(other.getVerifiedStatus()))
                && (this.getDappUrl() == null ? other.getDappUrl() == null : this.getDappUrl().equals(other.getDappUrl()))
                && (this.getMiscSettingRuns() == null ? other.getMiscSettingRuns() == null : this.getMiscSettingRuns().equals(other.getMiscSettingRuns()))

                && (this.getHvmVersion() == null ? other.getHvmVersion() == null : this.getHvmVersion().equals(other.getHvmVersion()))
                && (this.getCompilerType() == null ? other.getCompilerType() == null : this.getCompilerType().equals(other.getCompilerType()))
                && (this.getCompilerVersion() == null ? other.getCompilerVersion() == null : this.getDappUrl().equals(other.getCompilerVersion()))
                && (this.getCreateTimestamp() == null ? other.getCreateTimestamp() == null : this.getMiscSettingRuns().equals(other.getCreateTimestamp()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_info
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getContractAddr() == null) ? 0 : getContractAddr().hashCode());
        result = prime * result + ((getContractCreater() == null) ? 0 : getContractCreater().hashCode());
        result = prime * result + ((getContractName() == null) ? 0 : getContractName().hashCode());
        result = prime * result + ((getContractSrc() == null) ? 0 : getContractSrc().hashCode());
        result = prime * result + ((getContractAbi() == null) ? 0 : getContractAbi().hashCode());
        result = prime * result + ((getContractBin() == null) ? 0 : getContractBin().hashCode());
        result = prime * result + ((getContractType() == null) ? 0 : getContractType().hashCode());
        result = prime * result + ((getOptimizeFlag() == null) ? 0 : getOptimizeFlag().hashCode());
        result = prime * result + ((getBalance() == null) ? 0 : getBalance().hashCode());
        result = prime * result + ((getVerifiedStatus() == null) ? 0 : getVerifiedStatus().hashCode());
        result = prime * result + ((getDappUrl() == null) ? 0 : getDappUrl().hashCode());
        result = prime * result + ((getMiscSettingRuns() == null) ? 0 : getMiscSettingRuns().hashCode());
        result = prime * result + ((getHvmVersion() == null) ? 0 : getHvmVersion().hashCode());
        result = prime * result + ((getCompilerType() == null) ? 0 : getCompilerType().hashCode());
        result = prime * result + ((getCompilerVersion() == null) ? 0 : getCompilerVersion().hashCode());
        result = prime * result + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        return result;
    }
}