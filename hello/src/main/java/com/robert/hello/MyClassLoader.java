package com.robert.hello;

public class MyClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println(name);
        if ("sample.HelloWorld".equals(name)) {
            byte[] bytes = HelloWorldDump.dump();
            return defineClass(name, bytes, 0, bytes.length);
        }
        return super.findClass(name);
    }
}
