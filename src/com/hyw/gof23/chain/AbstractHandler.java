package com.hyw.gof23.chain;

public abstract class AbstractHandler implements Handler {
    private Handler next = null;

    protected void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handler() {
        this.work();
        if (this.next == null){
            System.out.println("当前节点为末节点，流程结束！");
            return;
        }else{
            this.next.handler();
        }
    }

    protected abstract void work();
}
