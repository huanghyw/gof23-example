package com.hyw.gof23.chain.impl;

import com.hyw.gof23.chain.AbstractHandler;

public class FlowD extends AbstractHandler {
    @Override
    protected void work() {
        System.out.println("流程 FlowD");
        setNext(new End());
    }
}
