package com.fantj.abstract_factory;

/**
 * Created by Fant.J.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract <T> T getShape(Class<T> clazz) ;
}
