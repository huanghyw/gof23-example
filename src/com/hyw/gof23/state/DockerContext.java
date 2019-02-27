package com.hyw.gof23.state;

import com.hyw.gof23.state.dockerstate.CloseState;
import com.hyw.gof23.state.dockerstate.OpenState;
import com.hyw.gof23.state.dockerstate.PausingState;

public class DockerContext {
    public static final DockerState CLOSE_STATE = new CloseState();
    public static final DockerState OPEN_STATE = new OpenState();
    public static final DockerState PAUSING_STATE = new PausingState();

    private DockerState dockerCurrentState;

    public DockerContext(){
        // 默认为关机状态
        this.dockerCurrentState = CLOSE_STATE;
    }

    public void setDockerCurrentState(DockerState dockerCurrentState) {
        this.dockerCurrentState = dockerCurrentState;
    }

    /**
     * 开机
     */
    public void open() {
        this.dockerCurrentState.open(this);
    }

    /**
     * 关机
     */
    public void close() {
        this.dockerCurrentState.close(this);
    }

    /**
     * 暂停
     */
    public void pause() {
        this.dockerCurrentState.pause(this);
    }

    /**
     * 恢复
     */
    public void resume() {
        this.dockerCurrentState.resume(this);
    }
}
