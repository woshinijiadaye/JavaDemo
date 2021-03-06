package com.example.demo.javax0.基础语法.接口多态;

/**
 * Interface 接口 可多继承，类可多实现，
 * 应用场景：公共类编写，等常用
 *
 * @author 李泽阳 on 2020/1/2 13:57
 */
public class Interface {


    interface testInterfaceA {
        // 同名抽象方法
        public void sleep();
    }


    // 同名抽象方法[合并父类方法]
    interface testInterfaceB extends testInterfaceA {
        public void sleep();
    }

    // 同名抽象方法[合并父类方法]
    interface testInterfaceC extends testInterfaceB {
        public void sleep();
    }

    /**
     * 场景一：接口的多继承，会将同类方法进行，合并
     */
    interface testInterfaceD extends testInterfaceA, testInterfaceB, testInterfaceC {

    }

    class test implements testInterfaceD {
        public void sleep() {

        }
    }
}