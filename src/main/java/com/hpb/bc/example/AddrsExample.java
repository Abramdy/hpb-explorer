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

package com.hpb.bc.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AddrsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table addrs
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table addrs
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table addrs
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table addrs
     *
     * @mbg.generated
     */
    public AddrsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table addrs
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table addrs
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table addrs
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table addrs
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table addrs
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table addrs
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table addrs
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table addrs
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table addrs
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table addrs
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table addrs
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Long value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Long value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Long value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Long value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Long value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Long> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Long> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Long value1, Long value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Long value1, Long value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andStartBlockIsNull() {
            addCriterion("start_block is null");
            return (Criteria) this;
        }

        public Criteria andStartBlockIsNotNull() {
            addCriterion("start_block is not null");
            return (Criteria) this;
        }

        public Criteria andStartBlockEqualTo(Long value) {
            addCriterion("start_block =", value, "startBlock");
            return (Criteria) this;
        }

        public Criteria andStartBlockNotEqualTo(Long value) {
            addCriterion("start_block <>", value, "startBlock");
            return (Criteria) this;
        }

        public Criteria andStartBlockGreaterThan(Long value) {
            addCriterion("start_block >", value, "startBlock");
            return (Criteria) this;
        }

        public Criteria andStartBlockGreaterThanOrEqualTo(Long value) {
            addCriterion("start_block >=", value, "startBlock");
            return (Criteria) this;
        }

        public Criteria andStartBlockLessThan(Long value) {
            addCriterion("start_block <", value, "startBlock");
            return (Criteria) this;
        }

        public Criteria andStartBlockLessThanOrEqualTo(Long value) {
            addCriterion("start_block <=", value, "startBlock");
            return (Criteria) this;
        }

        public Criteria andStartBlockIn(List<Long> values) {
            addCriterion("start_block in", values, "startBlock");
            return (Criteria) this;
        }

        public Criteria andStartBlockNotIn(List<Long> values) {
            addCriterion("start_block not in", values, "startBlock");
            return (Criteria) this;
        }

        public Criteria andStartBlockBetween(Long value1, Long value2) {
            addCriterion("start_block between", value1, value2, "startBlock");
            return (Criteria) this;
        }

        public Criteria andStartBlockNotBetween(Long value1, Long value2) {
            addCriterion("start_block not between", value1, value2, "startBlock");
            return (Criteria) this;
        }

        public Criteria andLastestBlockIsNull() {
            addCriterion("lastest_block is null");
            return (Criteria) this;
        }

        public Criteria andLastestBlockIsNotNull() {
            addCriterion("lastest_block is not null");
            return (Criteria) this;
        }

        public Criteria andLastestBlockEqualTo(Long value) {
            addCriterion("lastest_block =", value, "lastestBlock");
            return (Criteria) this;
        }

        public Criteria andLastestBlockNotEqualTo(Long value) {
            addCriterion("lastest_block <>", value, "lastestBlock");
            return (Criteria) this;
        }

        public Criteria andLastestBlockGreaterThan(Long value) {
            addCriterion("lastest_block >", value, "lastestBlock");
            return (Criteria) this;
        }

        public Criteria andLastestBlockGreaterThanOrEqualTo(Long value) {
            addCriterion("lastest_block >=", value, "lastestBlock");
            return (Criteria) this;
        }

        public Criteria andLastestBlockLessThan(Long value) {
            addCriterion("lastest_block <", value, "lastestBlock");
            return (Criteria) this;
        }

        public Criteria andLastestBlockLessThanOrEqualTo(Long value) {
            addCriterion("lastest_block <=", value, "lastestBlock");
            return (Criteria) this;
        }

        public Criteria andLastestBlockIn(List<Long> values) {
            addCriterion("lastest_block in", values, "lastestBlock");
            return (Criteria) this;
        }

        public Criteria andLastestBlockNotIn(List<Long> values) {
            addCriterion("lastest_block not in", values, "lastestBlock");
            return (Criteria) this;
        }

        public Criteria andLastestBlockBetween(Long value1, Long value2) {
            addCriterion("lastest_block between", value1, value2, "lastestBlock");
            return (Criteria) this;
        }

        public Criteria andLastestBlockNotBetween(Long value1, Long value2) {
            addCriterion("lastest_block not between", value1, value2, "lastestBlock");
            return (Criteria) this;
        }

        public Criteria andFromCountIsNull() {
            addCriterion("from_count is null");
            return (Criteria) this;
        }

        public Criteria andFromCountIsNotNull() {
            addCriterion("from_count is not null");
            return (Criteria) this;
        }

        public Criteria andFromCountEqualTo(Long value) {
            addCriterion("from_count =", value, "fromCount");
            return (Criteria) this;
        }

        public Criteria andFromCountNotEqualTo(Long value) {
            addCriterion("from_count <>", value, "fromCount");
            return (Criteria) this;
        }

        public Criteria andFromCountGreaterThan(Long value) {
            addCriterion("from_count >", value, "fromCount");
            return (Criteria) this;
        }

        public Criteria andFromCountGreaterThanOrEqualTo(Long value) {
            addCriterion("from_count >=", value, "fromCount");
            return (Criteria) this;
        }

        public Criteria andFromCountLessThan(Long value) {
            addCriterion("from_count <", value, "fromCount");
            return (Criteria) this;
        }

        public Criteria andFromCountLessThanOrEqualTo(Long value) {
            addCriterion("from_count <=", value, "fromCount");
            return (Criteria) this;
        }

        public Criteria andFromCountIn(List<Long> values) {
            addCriterion("from_count in", values, "fromCount");
            return (Criteria) this;
        }

        public Criteria andFromCountNotIn(List<Long> values) {
            addCriterion("from_count not in", values, "fromCount");
            return (Criteria) this;
        }

        public Criteria andFromCountBetween(Long value1, Long value2) {
            addCriterion("from_count between", value1, value2, "fromCount");
            return (Criteria) this;
        }

        public Criteria andFromCountNotBetween(Long value1, Long value2) {
            addCriterion("from_count not between", value1, value2, "fromCount");
            return (Criteria) this;
        }

        public Criteria andToCountIsNull() {
            addCriterion("to_count is null");
            return (Criteria) this;
        }

        public Criteria andToCountIsNotNull() {
            addCriterion("to_count is not null");
            return (Criteria) this;
        }

        public Criteria andToCountEqualTo(Long value) {
            addCriterion("to_count =", value, "toCount");
            return (Criteria) this;
        }

        public Criteria andToCountNotEqualTo(Long value) {
            addCriterion("to_count <>", value, "toCount");
            return (Criteria) this;
        }

        public Criteria andToCountGreaterThan(Long value) {
            addCriterion("to_count >", value, "toCount");
            return (Criteria) this;
        }

        public Criteria andToCountGreaterThanOrEqualTo(Long value) {
            addCriterion("to_count >=", value, "toCount");
            return (Criteria) this;
        }

        public Criteria andToCountLessThan(Long value) {
            addCriterion("to_count <", value, "toCount");
            return (Criteria) this;
        }

        public Criteria andToCountLessThanOrEqualTo(Long value) {
            addCriterion("to_count <=", value, "toCount");
            return (Criteria) this;
        }

        public Criteria andToCountIn(List<Long> values) {
            addCriterion("to_count in", values, "toCount");
            return (Criteria) this;
        }

        public Criteria andToCountNotIn(List<Long> values) {
            addCriterion("to_count not in", values, "toCount");
            return (Criteria) this;
        }

        public Criteria andToCountBetween(Long value1, Long value2) {
            addCriterion("to_count between", value1, value2, "toCount");
            return (Criteria) this;
        }

        public Criteria andToCountNotBetween(Long value1, Long value2) {
            addCriterion("to_count not between", value1, value2, "toCount");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(Integer value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(Integer value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(Integer value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(Integer value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<Integer> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<Integer> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table addrs
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table addrs
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}