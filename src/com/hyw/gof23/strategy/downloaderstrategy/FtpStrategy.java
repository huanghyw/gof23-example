package com.hyw.gof23.strategy.downloaderstrategy;

import com.hyw.gof23.strategy.DownloaderStrategy;

public class FtpStrategy implements DownloaderStrategy {
    /**
     * 开始工作
     */
    @Override
    public void begin() {
        System.out.println("连接FTP服务器，开始爬取指定内容！");
    }
}
