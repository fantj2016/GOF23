package com.fantj.abstract_factory;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Fant.J.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }


    @Override
    <T> T getShape(Class<T> clazz) {
        T obj = null;
        try {
            obj = clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return obj;
    }
}