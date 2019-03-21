package com.itheima.demo02.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
java.util.Iterator接口:迭代器(对集合进行遍历)
    boolean hasNext() 如果仍有元素可以迭代,则返回true
    E next() 返回迭代的下一个元素.取出
Iterator是一个接口,需要使用Iterator接口的实现类对象
Collection接口中有一个方法,iterator(),返回的是迭代器的实现类对象
bollean hasNext()
E next()配合使用while循环

 */
public class Demo01Iterator {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> collection=new ArrayList<>();
        ((ArrayList<String>) collection).add("123");
        ((ArrayList<String>) collection).add("bbb");
        ((ArrayList<String>) collection).add("aaa");
        ((ArrayList<String>) collection).add("ddd");

        //Iterator<E> 接口有泛型
        Iterator<String> it=collection.iterator();//多态
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        for (Iterator<String> it2=collection.iterator();it2.hasNext();){//for(初始化;boolean 判断;指针移步)  因为next()就能使指针移步,第三个位置不填
            String s=it2.next();
            System.out.println(s);
        }
    }
}
