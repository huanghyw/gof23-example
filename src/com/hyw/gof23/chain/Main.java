package com.hyw.gof23.chain;

import com.hyw.gof23.chain.impl.Begin;
import com.hyw.gof23.chain.impl.FlowC1;

public class Main {
    public static void main(String[] args) {
        System.out.println("------From Begin Node---------");

        // 创建一个Begin节点，并开始处理
        Handler begin = new Begin();
        begin.handler();

        System.out.println("------From FlowC1 Node---------");

        // 创建一个FlowC1节点，并开始处理
        Handler flowC1 = new FlowC1();
        flowC1.handler();
    }
}
