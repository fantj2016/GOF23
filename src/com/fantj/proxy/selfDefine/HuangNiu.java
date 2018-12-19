package com.fantj.proxy.selfDefine;
import com.fantj.proxy.jdk.People;
import java.lang.reflect.Method;

public class HuangNiu implements  MyInvocationHandler{

    private People people;
    /**
     * 获取被代理对象信息
     */
    public Object getInstance(People people){
        this.people = people;
        Class clazz = people.getClass();
        System.out.println("没生成代理之前的class对象:"+clazz );
        return MyProxy.newProxyInstance(new MyClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理中...");
        method.invoke(people);
        System.out.println("代理处理完毕,OK,请查收");
        return null;
    }
}
