package com.ant;

import com.ant.java_spi.api.CarInterface;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @ClassName CarDemo
 * @Description CarDemo
 * @Author Ant
 * @Date 2019-05-29 11:07
 * @Version 1.0
 **/
public class CarDemo {
    public static void main(String[] args) {
        ServiceLoader<CarInterface> loader = ServiceLoader.load(CarInterface.class);
        Iterator<CarInterface> iterator = loader.iterator();
        while (iterator.hasNext()) {
            CarInterface next = iterator.next();
            next.getColor();
        }
    }
}
