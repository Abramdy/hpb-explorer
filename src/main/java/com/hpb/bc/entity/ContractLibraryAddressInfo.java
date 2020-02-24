package com.hpb.bc.entity;

import java.util.Date;

public class ContractLibraryAddressInfo extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_library_address_info.contract_address
     *
     * @mbg.generated
     */
    private String contractAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_library_address_info.library_name
     *
     * @mbg.generated
     */
    private String libraryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_library_address_info.library_contract_address
     *
     * @mbg.generated
     */
    private String libraryContractAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column contract_library_address_info.create_timestamp
     *
     * @mbg.generated
     */
    private Date createTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_library_address_info.contract_address
     *
     * @return the value of contract_library_address_info.contract_address
     * @mbg.generated
     */
    public String getContractAddress() {
        return contractAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_library_address_info.contract_address
     *
     * @param contractAddress the value for contract_library_address_info.contract_address
     * @mbg.generated
     */
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress == null ? null : contractAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_library_address_info.library_name
     *
     * @return the value of contract_library_address_info.library_name
     * @mbg.generated
     */
    public String getLibraryName() {
        return libraryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_library_address_info.library_name
     *
     * @param libraryName the value for contract_library_address_info.library_name
     * @mbg.generated
     */
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName == null ? null : libraryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_library_address_info.library_contract_address
     *
     * @return the value of contract_library_address_info.library_contract_address
     * @mbg.generated
     */
    public String getLibraryContractAddress() {
        return libraryContractAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_library_address_info.library_contract_address
     *
     * @param libraryContractAddress the value for contract_library_address_info.library_contract_address
     * @mbg.generated
     */
    public void setLibraryContractAddress(String libraryContractAddress) {
        this.libraryContractAddress = libraryContractAddress == null ? null : libraryContractAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column contract_library_address_info.create_timestamp
     *
     * @return the value of contract_library_address_info.create_timestamp
     * @mbg.generated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column contract_library_address_info.create_timestamp
     *
     * @param createTimestamp the value for contract_library_address_info.create_timestamp
     * @mbg.generated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_library_address_info
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
        ContractLibraryAddressInfo other = (ContractLibraryAddressInfo) that;
        return (this.getContractAddress() == null ? other.getContractAddress() == null : this.getContractAddress().equals(other.getContractAddress()))
                && (this.getLibraryName() == null ? other.getLibraryName() == null : this.getLibraryName().equals(other.getLibraryName()))
                && (this.getLibraryContractAddress() == null ? other.getLibraryContractAddress() == null : this.getLibraryContractAddress().equals(other.getLibraryContractAddress()))
                && (this.getCreateTimestamp() == null ? other.getCreateTimestamp() == null : this.getCreateTimestamp().equals(other.getCreateTimestamp()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contract_library_address_info
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getContractAddress() == null) ? 0 : getContractAddress().hashCode());
        result = prime * result + ((getLibraryName() == null) ? 0 : getLibraryName().hashCode());
        result = prime * result + ((getLibraryContractAddress() == null) ? 0 : getLibraryContractAddress().hashCode());
        result = prime * result + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        return result;
    }
}