package com.hyw.gof23.state.dockerstate;

import com.hyw.gof23.state.DockerContext;
import com.hyw.gof23.state.DockerState;

/**
 * 开机状态
 */
public class OpenState implements DockerState {
    /**
     * 开机
     */
    @Override
    public void open(DockerContext dockerContext) {
        System.out.println("此操作无法执行，当前已经是开机状态！");
    }

    /**
     * 关机
     */
    @Override
    public void close(DockerContext dockerContext) {
        dockerContext.setDockerCurrentState(DockerContext.CLOSE_STATE);
        System.out.println("关机成功！");
    }

    /**
     * 暂停
     */
    @Override
    public void pause(DockerContext dockerContext) {
        dockerContext.setDockerCurrentState(DockerContext.PAUSING_STATE);
        System.out.println("暂停成功！");
    }

    /**
     * 恢复
     */
    @Override
    public void resume(DockerContext dockerContext) {
        System.out.println("此操作无法执行，非暂停状态下无法进行恢复动作！");
    }
}
