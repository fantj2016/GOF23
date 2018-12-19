package com.fantj.abstract_factory;

/**
 * Created by Fant.J.
 */
public class Test {
    public static void main(String[] args) {
        //抽象类不能直接调用，所以我们实例化 只能实例其子类对象
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        shapeFactory.getShape(Circle.class).describe();
    }
}