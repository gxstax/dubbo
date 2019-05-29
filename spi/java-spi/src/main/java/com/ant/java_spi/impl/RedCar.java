package com.ant.java_spi.impl;

import com.ant.java_spi.api.CarInterface;

/**
 * @ClassName RedCar
 * @Description RedCar
 * @Author Ant
 * @Date 2019-05-29 11:07
 * @Version 1.0
 **/
public class RedCar implements CarInterface {
    @Override
    public void getColor() {
        System.out.println("Red");
    }
}
