package com.hyw.gof23.chain.impl;

import com.hyw.gof23.chain.AbstractHandler;

public class Begin extends AbstractHandler {
    @Override
    protected void work() {
        System.out.println("流程 Begin");
//        this.setNext(new End());
//        this.setNext(new FlowA());
    }
}
