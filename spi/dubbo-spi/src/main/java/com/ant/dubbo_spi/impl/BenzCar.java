package com.ant.dubbo_spi.impl;

import com.ant.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;

/**
 * @ClassName BenzCar
 * @Description BenzCar
 * @Author Ant
 * @Date 2019-05-29 13:32
 * @Version 1.0
 **/
public class BenzCar implements CarInterface {

    private CarInterface carInterface;

    // 注入点
    public void setCarInterface (CarInterface carInterface) {
        this.carInterface = carInterface;
    }
    @Override
    public void getColor(URL url) {
        System.out.println("Benz");
        carInterface.getColor(url);

    }
}
