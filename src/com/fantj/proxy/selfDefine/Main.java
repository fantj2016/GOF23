package com.fantj.proxy.selfDefine;

import com.fantj.proxy.jdk.HuangNiu;
import com.fantj.proxy.jdk.People;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        People instance = (People)new HuangNiu().getInstance(new Me("Fantj", "JAY演唱会门票"));
        instance.speak();
        System.out.println("生成代理对象后对象变成:"+instance.getClass());

        /**
         * 生成代码
         */
//        try {
//            byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{instance.getClass()});
//            String path = Main.class.getResource("").toString();
////            System.out.println("get the path"+path);
//            FileOutputStream fileOutputStream = new FileOutputStream("$Proxy0.class");
//            fileOutputStream.write($Proxy0s);
//            fileOutputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
