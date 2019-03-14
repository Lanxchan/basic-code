package cn.itcast.day09.demo01;
/*
在继承的关系中,子类就是一个父类

父类定义方法同普通方法一样
public class 父类名称{

}

子类定义:
 public class 子类名称 extends 父类名称{

 }
 */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建子类对象
        Teacher te=new Teacher();
        te.method();//子类Teacher可以调用父类Employee中的方法

        Assistant as=new Assistant();
        as.method();
    }
}
