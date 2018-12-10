package com.hyw.gof23.state;

public class Main {

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
