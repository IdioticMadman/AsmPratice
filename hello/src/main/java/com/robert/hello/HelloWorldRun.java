package com.robert.hello;

import com.robert.util.ASMPrint;

import java.io.IOException;

public class HelloWorldRun {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        MyClassLoader loader = new MyClassLoader();
        Class<?> clazz = loader.loadClass("sample.HelloWorld");
        Object instance = clazz.newInstance();
        System.out.println(instance);
        ASMPrint.print("com.robert.hello.HelloWorldDump", false);
    }
}
