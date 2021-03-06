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

package com.hpb.bc.service.impl;

import com.hpb.bc.configure.RedisExpireTimeProperties;
import com.hpb.bc.entity.BlockAddrs;
import com.hpb.bc.example.BlockAddrsExample;
import com.hpb.bc.mapper.BlockAddrsMapper;
import com.hpb.bc.service.BlockService;
import com.hpb.bc.service.RedisTriggerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedisTriggerServiceImpl implements RedisTriggerService {

    public Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    BlockAddrsMapper blockAddrsMapper;

    @Autowired
    BlockService blockService;

    @Autowired
    RedisExpireTimeProperties redisExpireTimeProperties;

    @Override
    public void pushBlockIntoRedis() {
        BlockAddrsExample blockAddrsExample = new BlockAddrsExample();
        blockAddrsExample.createCriteria().andTxcountGreaterThan(Integer.valueOf(redisExpireTimeProperties.getRedisMiniTransactionCount()));
        List<BlockAddrs> blockAddrsList = blockAddrsMapper.selectByExample(blockAddrsExample);
        for (BlockAddrs blockAddrs : blockAddrsList) {
            Long bloucNumber = blockAddrs.getbNumber();
            log.info("pushBlockIntoRedis  bloucNumber {}, txCount {}", bloucNumber, blockAddrs.getTxcount());
            try {
                blockService.getBlockInfoByBlockNumber(String.valueOf(bloucNumber));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
