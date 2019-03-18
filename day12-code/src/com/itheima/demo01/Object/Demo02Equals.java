package com.itheima.demo01.Object;

import java.util.ArrayList;

/*
person类继承了Object类,所以可以使用Object类的equals方法
boolean equals(Object obj)
基本数据的值
引用数据类型比较的是两个对象的地址值

 */
public class Demo02Equals {
    public static void main(String[] args) {
        Person p1=new Person(18,"a");
        Person p2=new Person(19,"b");
        Person p3=new Person(18,"a");
        System.out.println("p1"+p1);
        System.out.println("p2"+p2);
        System.out.println("p3"+p3);
        System.out.println(p1.equals(p2));//重写equals()方法之后
        System.out.println(p1.equals(p3));//重写equals()方法之后

        boolean b=p1.equals(null);
        ArrayList<Integer> list=new ArrayList<>();
        boolean b1=p1.equals(list);

    }
}
