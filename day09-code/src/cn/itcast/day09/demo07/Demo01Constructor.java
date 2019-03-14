package cn.itcast.day09.demo07;
/*
继承关系中,父子类构造方法的访问特点

1.子类构造方法中有一个默认隐含的  super()  调用
用来调用父类构造方法
2.子类构造可以通过super关键字来调用父类重载构造.Zi.java中第5和6行
3.super的父类构造方法调用,必须是子类构造方法的第一句

子类必须调用父类构造方法,不写则用默认super(),必须是第一个分号前,只能有一个
 */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi z=new Zi();
        //父类构造方法先执行


    }
}
