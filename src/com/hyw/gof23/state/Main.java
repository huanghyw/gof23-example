package com.hyw.gof23.state;

public class Main {

    /**
     * 场景1：关机状态下执行关机、暂停动作
     * 场景2：关机状态下执行开机、关机动作
     * 场景3：关机状态下执行开机、暂停、关机动作
     * 场景4：关机状态下执行开机、暂停、恢复、关机动作
     *
     * @param args
     */
    public static void main(String[] args) {
        DockerContext dockerContext = new DockerContext();

        int operatCode = 4;

        switch (operatCode){
            case 1:
                dockerContext.close();
                dockerContext.pause();
                break;
            case 2:
                dockerContext.open();
                dockerContext.close();
                break;
            case 3:
                dockerContext.open();
                dockerContext.pause();
                dockerContext.close();
                break;
            case 4:
                dockerContext.open();
                dockerContext.pause();
                dockerContext.resume();
                dockerContext.close();
                break;
            default:
                System.out.println("not support operation!");
                break;
        }
    }
}
