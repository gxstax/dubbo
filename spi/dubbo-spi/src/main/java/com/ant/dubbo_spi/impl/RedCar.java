package com.ant.dubbo_spi.impl;

import com.ant.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;

/**
 * @ClassName RedCar
 * @Description RedCar
 * @Author Ant
 * @Date 2019-05-29 11:24
 * @Version 1.0
 **/
public class RedCar implements CarInterface {
    @Override
    public void getColor(URL url) {
        System.out.println("Red");
    }
}
