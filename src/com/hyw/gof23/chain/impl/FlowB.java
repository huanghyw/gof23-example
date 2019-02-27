package com.hyw.gof23.chain.impl;

import com.hyw.gof23.chain.AbstractHandler;

public class FlowB extends AbstractHandler {
    @Override
    protected void work() {
        System.out.println("流程 FlowB");
        setNext(new FlowC0());
//        setNext(new FlowC1());
//        setNext(new FlowC2());
    }
}
