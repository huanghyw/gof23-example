package com.hyw.gof23.state.dockerstate;

import com.hyw.gof23.state.DockerContext;
import com.hyw.gof23.state.DockerState;

/**
 * 暂停中状态
 */
public class PausingState implements DockerState {
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
        System.out.println("此操作无法执行，暂停状态下无法进行关机！");
    }

    /**
     * 暂停
     */
    @Override
    public void pause(DockerContext dockerContext) {
        System.out.println("此操作无法执行，当前已经是暂停状态！");
    }

    /**
     * 恢复
     */
    @Override
    public void resume(DockerContext dockerContext) {
        dockerContext.setDockerCurrentState(DockerContext.OPEN_STATE);
        System.out.println("恢复成功！");
    }
}
