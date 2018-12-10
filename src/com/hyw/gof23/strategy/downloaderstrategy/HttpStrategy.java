package com.hyw.gof23.strategy.downloaderstrategy;

import com.hyw.gof23.strategy.DownloaderStrategy;

/**
 * HTTP方式
 */
public class HttpStrategy implements DownloaderStrategy {
    /**
     * 开始工作
     */
    @Override
    public void begin() {
        System.out.println("连接HTTP服务器，开始爬取指定内容！");
    }
}
