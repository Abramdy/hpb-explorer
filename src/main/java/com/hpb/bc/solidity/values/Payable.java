package com.hpb.bc.solidity.values;


import com.hpb.bc.rpc.SmartContract;

import java.lang.reflect.Method;
import java.util.concurrent.CompletableFuture;

/**
 * Created by davidroon on 15.01.17.
 * This code is released under Apache 2 license
 */
public class Payable<T> {

    private final SmartContract contract;
    private final Method method;
    private final Object[] arguments;

    public Payable(SmartContract contract, Method method, Object[] arguments) {
        this.contract = contract;
        this.method = method;
        this.arguments = arguments;
    }

    public CompletableFuture<T> with(HpbValue value) {
        return (CompletableFuture<T>) contract.callFunction(value, method, arguments);
    }

}
