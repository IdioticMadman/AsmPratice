package com.robert.util;


import org.objectweb.asm.ClassReader;
import org.objectweb.asm.util.ASMifier;
import org.objectweb.asm.util.Printer;
import org.objectweb.asm.util.Textifier;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.IOException;
import java.io.PrintWriter;

public class ASMPrint {
    public static void main(String[] args) throws IOException {
        print("sample.HelloWorld", true);
    }

    public static void print(String className, boolean asmCode) throws IOException {
        // 1. 设置参数
        int parsingOptions = ClassReader.SKIP_FRAMES | ClassReader.SKIP_DEBUG;

        // 2. 打印结果
        Printer printer = asmCode ? new ASMifier() : new Textifier();
        PrintWriter printWriter = new PrintWriter(System.out, true);
        TraceClassVisitor traceClassVisitor = new TraceClassVisitor(null, printer, printWriter);
        new ClassReader(className).accept(traceClassVisitor, parsingOptions);
    }
}