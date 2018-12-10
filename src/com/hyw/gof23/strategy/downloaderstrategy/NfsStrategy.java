package com.hyw.gof23.strategy.downloaderstrategy;

import com.hyw.gof23.strategy.DownloaderStrategy;

/**
 * NFS方式
 */
public class NfsStrategy implements DownloaderStrategy {
    /**
     * 开始工作
     */
    @Override
    public void begin() {
        System.out.println("连接NFS服务器，开始爬取指定内容！");
    }
}
