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

package com.hpb.bc.controller;

import com.github.pagehelper.PageInfo;
import com.hpb.bc.entity.TxInternalRecord;
import com.hpb.bc.entity.result.Result;
import com.hpb.bc.entity.result.ResultCode;
import com.hpb.bc.model.TxInternalRecordModel;
import com.hpb.bc.model.TxTransferHashModel;
import com.hpb.bc.service.TxInternalRecordService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/txInternal")
public class TxInternalTransferController extends BaseController {
    @Autowired
    TxInternalRecordService txInternalRecordService;

    @ApiOperation(value = "查询区块下的智能合约内部交易", notes = "查询区块下的智能合约内部交易")
    @PostMapping("/txInternalRecords")
    public List<Object> getBlockInternalRecord(@RequestBody TxInternalRecordModel model) {
        PageInfo<TxInternalRecord> pageInfo = txInternalRecordService.queryPageTxInternalRecordListByTxInternalRecord(model);
        Result<PageInfo<TxInternalRecord>> result = new Result<>(ResultCode.SUCCESS, pageInfo);
        return result.getValue();
    }


    @ApiOperation(value = "根据交易hash获取该交易内部交易", notes = "根据交易hash获取该交易内部交易")
    @PostMapping("/txHash/txInternalRecords")
    public List<Object> getTxTransfer(@RequestBody TxTransferHashModel model) {
        TxInternalRecordModel model1 = new TxInternalRecordModel();
        model1.setTxHash(model.getTxHash());
        model1.setCurrentPage(model.getCurrentPage());
        model1.setPageSize(model.getPageSize());
        PageInfo<TxInternalRecord> pageInfo = txInternalRecordService.queryPageTxInternalRecordListByTxInternalRecord(model1);
        Result<PageInfo<TxInternalRecord>> result = new Result<>(ResultCode.SUCCESS, pageInfo);
        return result.getValue();
    }


}