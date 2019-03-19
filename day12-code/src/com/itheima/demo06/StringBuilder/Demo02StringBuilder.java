package com.itheima.demo06.StringBuilder;
/*
bu.append(...)返回的是bu本身,不需要接收返回值

链式编程:方法返回值是一个对象,可以继续调用方法

 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu = new StringBuilder();
        StringBuilder bu2 = bu.append("abc");
        System.out.println(bu);
        System.out.println(bu2);
        System.out.println(bu==bu2);//比较的是地址

        bu.append("ccc");
        bu.append(1);
        bu.append(true);
        bu.append(2.2);
        System.out.println(bu);

        //链式编程
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase());
        bu.append("abc").append(1).append(true);
        System.out.println(bu);
    }
}
