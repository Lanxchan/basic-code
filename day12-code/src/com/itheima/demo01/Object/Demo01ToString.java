package com.itheima.demo01.Object;
/*
Object类的ToString()方法

 */
public class Demo01ToString {
    public static void main(String[] args) {
        Person p=new Person(18,"张三");
        String s=p.toString();
        System.out.println(s);
        //直接打印对象的名字,就是调用对象的ToString()方法
        //重写了对象的toString()方法

    }
}
