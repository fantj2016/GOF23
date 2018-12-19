package com.fantj.proxy.selfDefine;


import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 生成代理对象的代码
 */
public class MyProxy {
    public static Object newProxyInstance(MyClassLoader loader,
                                          Class<?>[] interfaces,
                                          MyInvocationHandler h)
            throws IllegalArgumentException {

        // 1. 生成源码
        String proxySrc = generateSrc(interfaces);
        //2. 将生成的源码保存
        String path = MyProxy.class.getResource("").getPath();
        File file = new File(path+"$Proxy0.java");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(proxySrc);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 3. 编译源码并生成class文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
        Iterable iterable = manager.getJavaFileObjects(file);

        JavaCompiler.CompilationTask task = compiler.getTask(null,manager ,null , null,null ,iterable );
        task.call();
        try {
            manager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 4. 将class文件内容加载到jvm

        // 5. 返回被代理的代理对象
        try {
            Class proxyClass = loader.findClass("$Proxy0") ;
            Constructor constructor = proxyClass.getConstructor(MyInvocationHandler.class);
            return constructor.newInstance(h);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String generateSrc(Class<?>[] interfaces){
        String src = "package com.fantj.proxy.selfDefine..........";
        // ... 拼接出一个class文件
        //...
        return src;
    }
}
