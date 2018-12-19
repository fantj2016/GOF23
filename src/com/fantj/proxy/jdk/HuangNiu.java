package com.fantj.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HuangNiu  implements InvocationHandler {

    private People people;
    /**
     * 获取被代理对象信息
     */
    public Object getInstance(People people){
        this.people = people;
        Class clazz = people.getClass();
        System.out.println("没生成代理之前的class对象:"+clazz );
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理中...");
        method.invoke(people);
        System.out.println("代理处理完毕,OK,请查收");
        return null;
    }
}
