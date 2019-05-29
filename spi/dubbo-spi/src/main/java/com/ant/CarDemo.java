package com.ant;

import com.ant.dubbo_spi.api.CarInterface;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CarDemo
 * @Description CarDemo
 * @Author Ant
 * @Date 2019-05-29 11:07
 * @Version 1.0
 **/
public class CarDemo {
    public static void main(String[] args) {
        ExtensionLoader<CarInterface> extensionLoader = ExtensionLoader.getExtensionLoader(CarInterface.class);
        Map map = new HashMap();
        map.put("car", "red");
        URL url = new URL("","",1, map);

        CarInterface red = extensionLoader.getExtension("benz");
        red.getColor(url);
    }
}
