package com.ant.dubbo_spi.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface CarInterface {
    @Adaptive("car")
    public void getColor(URL url);
}
