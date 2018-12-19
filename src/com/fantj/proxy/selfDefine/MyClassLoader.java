package com.fantj.proxy.selfDefine;

import java.io.*;
import java.lang.management.ClassLoadingMXBean;

/**
 * 实现代码生成 编译 并且动态加载到jvm
 */
public class MyClassLoader extends ClassLoader {

    private File file;

    MyClassLoader(){
        String path = MyClassLoader.class.getResource("").getPath();
        this.file = new File(path);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = MyClassLoader.class.getPackage().getName()+"." +name;
        if (file != null){
            File classFile = new File(file,name.replaceAll("\\.","/" )+ ".class");
            if (classFile.exists()){
                FileInputStream inputStream = null;
                ByteArrayOutputStream outputStream = null;
                try {
                    inputStream = new FileInputStream(classFile);
                    outputStream = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = inputStream.read(buff))!= -1){
                        outputStream.write(buff);
                    }
                    return defineClass(className,outputStream.toByteArray() , 0, outputStream.size());
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        if (null != inputStream) {
                            inputStream.close();
                        }
                        if (null != outputStream) {
                            outputStream.close();
                        }
                    }catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        return null;
    }
}
