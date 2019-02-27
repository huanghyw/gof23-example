package com.hyw.gof23.chain;

/**
 * 定义节点的公共逻辑
 */
public abstract class AbstractHandler implements Handler {
    private Handler next = null;

    protected void setNext(Handler next) {
        this.next = next;
    }


    // 节点处理
    @Override
    public void handler() {
        // 先处理本节点的工作
        this.work();
        if (this.next == null){
            // 如果当前节点处理完成后，没有定义下级节点，则本节点为流程最终节点
            System.out.println("当前节点为末节点，流程结束！");
            return;
        }else{
            // 触发下一节点的处理
            this.next.handler();
        }
    }

    // 每个节点具体的工作
    protected abstract void work();
}
