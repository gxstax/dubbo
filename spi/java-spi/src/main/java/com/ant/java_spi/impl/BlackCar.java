package com.ant.java_spi.impl;

import com.ant.java_spi.api.CarInterface;

/**
 * @ClassName BlackCar
 * @Description BlackCar
 * @Author Ant
 * @Date 2019-05-29 11:06
 * @Version 1.0
 **/
public class BlackCar implements CarInterface {
    @Override
    public void getColor() {
        System.out.println("Black");
    }
}
