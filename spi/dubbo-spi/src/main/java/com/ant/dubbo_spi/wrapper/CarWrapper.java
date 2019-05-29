package com.ant.dubbo_spi.wrapper;

import com.ant.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;

/**
 * @ClassName CarWrapper
 * @Description CarWrapper
 * @Author Ant
 * @Date 2019-05-29 11:49
 * @Version 1.0
 **/
public class CarWrapper implements CarInterface {

    private CarInterface carInterface;

    public CarWrapper(CarInterface carInterface) {
        this.carInterface = carInterface;
    }

    @Override
    public void getColor(URL url) {
        System.out.println("before");
        // AOP before
        carInterface.getColor(url);
        // AOP after
        System.out.println("after");
    }
}
