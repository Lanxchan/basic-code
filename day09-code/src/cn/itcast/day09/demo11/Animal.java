package cn.itcast.day09.demo11;
/*
抽象方法:就是加上abstract关键字,然后去掉大括号,直接分号结束
抽象类:抽象方法所在的类,必须是抽象类才行.在class之前写上abstract即可

如何使用抽象类和抽象方法:
1.不能直接创建new抽象类对象
2.必须用一个子类继承抽象父类
3.子类必须重写(@Override)抽象父类中的  所有  抽象方法
4.创建子类对象使用
 */
public abstract class Animal {
    public abstract void eat();//抽象方法

    //普通的成员方法
    public void mormalMethod(){

    }
}
