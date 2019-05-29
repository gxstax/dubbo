package com.ant.dubbo_spi.impl;

import com.ant.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.utils.UrlUtils;

/**
 * @ClassName BlackCar
 * @Description BlackCar
 * @Author Ant
 * @Date 2019-05-29 11:23
 * @Version 1.0
 **/
public class BlackCar implements CarInterface {
    @Override
    public void getColor(URL url) {
        System.out.println("Black");
    }
}
