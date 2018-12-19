package com.fantj.factory;

/**
 * 形状工厂（你可以通过我获取 相应的实例化对象）
 * Created by Fant.J.
 */
public class ShapeFactory {
    /**
     * 反射 + 泛型
     */
    public <T> T getShape(Class<? extends T> clazz){
        T object = null;
        try {
            //实例化，并在这里做 类型转换
            object = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
