package com.example.demo.jvm.内存区域;

/**
 * 类描述:JVM基础内存区域基础
 * Created by 李泽阳 on 2020/5/22 21:12
 */
public class Bases {
    /**
     * ******JVM基础知识********
     * 一：JDK,JRE,JVM 三者的区别？
     * JDK:开发环境
     * JRE:运行环境
     * JVM:翻译class文件变为对应操作系统的指令
     */


    /**
     * 二：JVM运行时的数据区（内存）
     * <起一个线程，就会有以下下面参数>
     * <1>线程私有：
     * 1、程序计数器   : 指向当前正在执行线程的字节码运行地址（行数）,因为java多线程,在进行上下文切换的时候，确保线程的正确性。
     * 2、本地方法栈   : 本地方法栈
     * 3、虚拟机栈     :
     *
     *
     * <2>线程共享
     * 1、堆
     * 2、方法区
     *
     *
     * 三：栈的概念
     * 答案：
     * <1>、栈是一种数据结构
     * <2>、入口出口只有一个
     * <3>、入栈，出栈
     *
     *
     * 特点：
     * <>先进先出，后进后出
     *
     *
     * 为什么JVM要使用栈？
     * 兼容方法调方法的特点
     *
     */

    /**
     * 四：虚拟机栈<当前线程>
     *     存储当前线程，运行方法所需的数据，指令，返回地址
     *     会进行压栈，出栈
     *
     * 栈帧<单个方法>
     *
     * 局部变量表：压栈
     * 操作数据栈：进行数据栈操作
     * 动态连接：
     * 返回地址
     *
     * 概念：运行时常量池，是在堆中运行
     *
     *
     * 五：堆，jdk1.7元空间，jdk1.8永久代。
     *
     *
     * 六：深入了解堆栈？
     *
     * 功能：
     * 1、以栈帧的方法存储调用过程，并存储方法调用过程中基本数据类型的变量（int，short...八大基本数据类型）
     * 以及对象的引用变量，其内存分配于栈上，变量出了作用域就会释放（存储基本数据类型，和堆内对象引用的地址）
     * 2、而堆内存用来存储Java中的对象，无论是成员变量，局部变量，类变量，指向的对象都存储在堆内存中。
     *
     *
     * 线程独享还是共享：
     * 1、栈内存属于单个线程，每个线程都会有一个栈内存，其存储的变量只能在其所属的线程可见，既栈内存可以理解为线程私有
     * 2、堆内存的对象对所有线程可见，堆内的对象可被所有对象引用。
     *
     *
     * 空间大小：
     * 1、栈内存远远小于堆内存，栈的深度是有限的，可能发生栈内存溢出（StackOverFlowError）问题。
     *
     *
     */


}
