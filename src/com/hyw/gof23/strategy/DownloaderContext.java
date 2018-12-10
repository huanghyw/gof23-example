package com.hyw.gof23.strategy;

import com.hyw.gof23.strategy.downloaderstrategy.HttpStrategy;

/**
 * 文件下载器
 */
public class DownloaderContext {
    private DownloaderStrategy downloaderStrategy;

    public DownloaderContext() {
        this.downloaderStrategy = new HttpStrategy();
    }

    public void setDownloaderStrategy(DownloaderStrategy downloaderStrategy) {
        this.downloaderStrategy = downloaderStrategy;
    }

    public void begin(){
        this.downloaderStrategy.begin();
    }
}
