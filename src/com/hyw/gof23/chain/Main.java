package com.hyw.gof23.chain;

import com.hyw.gof23.chain.impl.Begin;

public class Main {
    public static void main(String[] args) {
        Handler begin = new Begin();
        begin.handler();
    }
}
