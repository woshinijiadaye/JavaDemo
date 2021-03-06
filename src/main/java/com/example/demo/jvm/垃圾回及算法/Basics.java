package com.example.demo.jvm.垃圾回及算法;

/**
 * 类描述：垃圾回收
 * Created by 李泽阳 on 2020/5/18 16:48
 */
public class Basics {

    /**
     * ****垃圾GC回收基础
     *
     *
     * 1、谁需要GC垃圾回收？
     * 答：（1）栈（线程）——不需要
     *    （2）堆（对象），方法区（效率低）
     *
     *
     *
     *2、GC要做的事情？
     * 答：
     *（1）、where/which
     *（2）、whern
     *（3）、how
     *
     *
     *
     * 3、为什么要了解GC和内存分配？
     * 答：
     *
     * 4、忘记finalize关键字，？
     * 答：此关键字是指垃圾回收中，如果不存在引用对象可以保证此对象不被引用
     *
     * 但是！！！是存在一定的概率的，所以没有多大用，请忘记。
     */

    /**
     * todo  1、GC如何判断对象的存活
     *
     * 第一种方案：引用计数算法，计数器。
     * 只要有对象引用，计数器+1，当计数器=0，表示此对象可以回收了。
     *
     *
     * ****存在缺陷****
     * 多引用的时候，A.ins=B，B.ins=A,  此时会形成循环，所以不采用
     * 相互引用（）
     *
     *
     * todo 2、 java采用可达性分析
     * 在java，可作为GCRoot对象包括
     * 1、方法区中类静态属性引用的对象
     * 2、方法区中常量引用的对象
     * 3、虚拟机栈（本地方法表）中引用的对象
     * 4、本地方法栈JNI（Native方法）中引用的对象
     *
     * GCRoot的引用
     *
     *
     *
     *
     */
}
