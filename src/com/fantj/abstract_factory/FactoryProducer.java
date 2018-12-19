package com.fantj.abstract_factory;

/**
 * Created by Fant.J.
 */
public class FactoryProducer {
    public static <T> AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            //这里不举例子了，你可以自己 创建一个 ColorFactory
            return null;
        }
        return null;
    }
}