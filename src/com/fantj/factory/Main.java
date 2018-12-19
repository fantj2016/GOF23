package com.fantj.factory;

/**
 * Created by Fant.J.
 */
public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        //获取  圆形  实例化对象
        Shape circle = shapeFactory.getShape(Circle.class);
        //调用对象方法
        circle.describe();

        //获取 长方形  实例化对象
        Shape rectangle = shapeFactory.getShape(Rectangle.class);
        //调用方法
        rectangle.describe();

    }
}
