package com.hyw.gof23.chain.impl;

import com.hyw.gof23.chain.AbstractHandler;

public class Begin extends AbstractHandler {
    /**
     * 开始处理节点工作，如果处理完成后需要执行下级节点，则定义下一个节点需要谁来处理
     */
    @Override
    protected void work() {
        System.out.println("流程 Begin");

        boolean toEnd = false;

        if (toEnd){
            this.setNext(new End());
        }else{
            this.setNext(new FlowA());
        }
    }
}
