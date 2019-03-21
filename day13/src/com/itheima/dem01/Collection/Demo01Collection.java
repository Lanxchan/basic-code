package com.itheima.dem01.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
java.util.Collection接口
    所有单列集合的最顶层接口,里边定义了所有单列集合共性的方法
    任意的单列集合都可以使用Collection接口中的方法

 */
public class Demo01Collection {
    public static void main(String[] args) {
        //创建集合对象,可以使用多态
//        Collection<String> col=new ArrayList<>();
        Collection<String> col=new HashSet<>();
        System.out.println(col);//重写了toString()方法

        /*
            public bollean add(E e) 返回的是bollean,不用接收
         */
        ((ArrayList<String>) col).add("张三");
        ((ArrayList<String>) col).add("李四");
        ((ArrayList<String>) col).add("李四");
        ((ArrayList<String>) col).add("李四");

        System.out.println(col);
        ((ArrayList<String>) col).remove("赵六");

        //删除不存在的
        boolean b = ((ArrayList<String>) col).remove("赵四");
        System.out.println(b);

        boolean b1 = col.contains("李四");
        System.out.println(b1);

        boolean b2 = col.isEmpty();
        System.out.println(b2);

        System.out.println(col.size());

        //Object[]使用方法
        Object[] array = col.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        col.clear();
        System.out.println(col);

    }
}
