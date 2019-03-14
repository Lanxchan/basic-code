package cn.itcast.day08.demo03;
/*
静态代码块

public class 类名称{
    static {
    //静态代码块内容


    }

}
当第一次使用本类时,静态代码块执行唯一一次
 */
public class Person {

    static {
        System.out.println("静态代码块执行!");
    }

    public Person(){
        System.out.println("构造方法执行!");
    }
}
