package com.hyw.gof23.state;

/**
 * Docker 状态
 */
public interface DockerState {
    /**
     * 开机
     */
    void open(DockerContext dockerContext);
    /**
     * 关机
     */
    void close(DockerContext dockerContext);
    /**
     * 暂停
     */
    void pause(DockerContext dockerContext);
    /**
     * 恢复
     */
    void resume(DockerContext dockerContext);
}
