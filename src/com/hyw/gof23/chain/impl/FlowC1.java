package com.hyw.gof23.chain.impl;

import com.hyw.gof23.chain.AbstractHandler;

public class FlowC1 extends AbstractHandler {
    @Override
    protected void work() {
        System.out.println("流程 FlowC1");
        setNext(new FlowD());
    }
}
