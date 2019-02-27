package com.hyw.gof23.chain.impl;

import com.hyw.gof23.chain.AbstractHandler;

public class FlowA extends AbstractHandler {

    @Override
    protected void work() {
        System.out.println("流程 FlowA");
        setNext(new FlowB());
    }
}
