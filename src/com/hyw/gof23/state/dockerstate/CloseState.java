package com.hyw.gof23.state.dockerstate;

import com.hyw.gof23.state.DockerContext;
import com.hyw.gof23.state.DockerState;

/**
 * 关闭状态
 */
public class CloseState implements DockerState {

    /**
     * 开机
     */
    @Override
    public void open(DockerContext dockerContext) {
        dockerContext.setDockerCurrentState(DockerContext.OPEN_STATE);
        System.out.println("开机成功！");
    }

    /**
     * 关机
     */
    @Override
    public void close(DockerContext dockerContext) {
        System.out.println("此操作无法执行，当前已经是关闭状态！");
    }

    /**
     * 暂停
     */
    @Override
    public void pause(DockerContext dockerContext) {
        System.out.println("此操作无法执行，关机状态下无法进行暂停动作！");
    }

    /**
     * 恢复
     */
    @Override
    public void resume(DockerContext dockerContext) {
        System.out.println("此操作无法执行，关机状态下无法进行恢复动作！");
    }
}
