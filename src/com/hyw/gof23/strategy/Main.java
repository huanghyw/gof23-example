package com.hyw.gof23.strategy;

import com.hyw.gof23.strategy.downloaderstrategy.FtpStrategy;
import com.hyw.gof23.strategy.downloaderstrategy.HttpStrategy;
import com.hyw.gof23.strategy.downloaderstrategy.NfsStrategy;

public class Main {

    public static void main(String[] args) {
        DownloaderContext downloaderContext = new DownloaderContext();

        downloaderContext.setDownloaderStrategy(new HttpStrategy());
        downloaderContext.begin();

        downloaderContext.setDownloaderStrategy(new FtpStrategy());
        downloaderContext.begin();

        downloaderContext.setDownloaderStrategy(new NfsStrategy());
        downloaderContext.begin();
    }
}
