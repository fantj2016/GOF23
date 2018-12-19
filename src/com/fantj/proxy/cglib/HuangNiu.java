package com.fantj.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * 自动生成一个类，继承你的类，然后把子类引用指向父类
 * 比JDK好在哪： 少写了一个接口
 */
public class HuangNiu  implements MethodInterceptor {

    /**
     * 获取被代理对象信息
     *
     */
    public Object getInstance(Object object){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        System.out.println("生成代理对象前对象是:"+object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理中...");
        methodProxy.invokeSuper(o, objects);
//        methodProxy.invoke(o, objects);
        System.out.println("代理处理完毕,OK,请查收");
        return null;
    }
}
