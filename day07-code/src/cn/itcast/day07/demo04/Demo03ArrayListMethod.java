package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
ArrayList常用方法

public bollean add(E e); 向集合中添加元素,参数的类型和泛型一致
public E get(int index); 从集合中获取元素,参数是索引编号,返回值是对应位置元素
public E remove(int index); 删除元素
public int size(); 获取集合长度
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> ali=new ArrayList<>();

        //添加
        boolean success=ali.add("aa");
        System.out.println(success);

        //获取集合长度
        int size=ali.size();
        System.out.println(size);

        //读取
        String stra=ali.get(0);
        System.out.println(stra);

        //删除
        String rem = ali.remove(0);
        System.out.println(rem);
        System.out.println(ali);


    }
}
