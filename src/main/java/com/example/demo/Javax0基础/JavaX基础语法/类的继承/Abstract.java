package com.example.demo.Javax0基础.JavaX基础语法.类的继承;

/**
 * abstract 抽象类，
 * 应用场景：设计模型多用、接口便是抽象类
 *
 * @author 李泽阳 on 2020/1/1 11:18
 */
public class Abstract {


    /*
     *定义abstract:具有相同的行为，不同的表现
     */

    abstract class testAbstractParent {
        abstract public void methods();
    }

    abstract class testAbstractSon extends testAbstractParent {
        /**
         * 场景三：
         * 抽象类可继承抽象类
         */
    }

    class testExtends extends testAbstractParent {
        /**
         * 场景二：
         * 需要重写实现，抽象父类中的抽象方法
         */
        @Override
        public void methods() {

        }
    }

    /*
     * 场景一：
     * 抽象类不可创建对象，只有具体实现类才可创建对象
     * */

    public void testNew() {
        /*testAbstractParent a=new testAbstractParent();*/
        testExtends testExtends = new testExtends();
    }
    /**
     * 场景四：
     * 不可被，static， final， private 关键字标识
     */

}
