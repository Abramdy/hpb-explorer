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

public class HpbVoteRoundNum extends BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_vote_round_num.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hpb_vote_round_num.vote_round
     *
     * @mbg.generated
     */
    private Integer voteRound;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_vote_round_num.id
     *
     * @return the value of hpb_vote_round_num.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_vote_round_num.id
     *
     * @param id the value for hpb_vote_round_num.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hpb_vote_round_num.vote_round
     *
     * @return the value of hpb_vote_round_num.vote_round
     * @mbg.generated
     */
    public Integer getVoteRound() {
        return voteRound;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hpb_vote_round_num.vote_round
     *
     * @param voteRound the value for hpb_vote_round_num.vote_round
     * @mbg.generated
     */
    public void setVoteRound(Integer voteRound) {
        this.voteRound = voteRound;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hpb_vote_round_num
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
        HpbVoteRoundNum other = (HpbVoteRoundNum) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getVoteRound() == null ? other.getVoteRound() == null : this.getVoteRound().equals(other.getVoteRound()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hpb_vote_round_num
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getVoteRound() == null) ? 0 : getVoteRound().hashCode());
        return result;
    }
}