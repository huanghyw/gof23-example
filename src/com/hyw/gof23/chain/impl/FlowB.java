package com.hyw.gof23.chain.impl;

import com.hyw.gof23.chain.AbstractHandler;

public class FlowB extends AbstractHandler {
    @Override
    protected void work() {
        System.out.println("流程 FlowB");
        int status = 1;

        if (status == 1){
            this.setNext(new FlowC0());
        }else if (status == 2){
            this.setNext(new FlowC1());
        }else if (status == 3){
            this.setNext(new FlowC2());
        }
    }
}
