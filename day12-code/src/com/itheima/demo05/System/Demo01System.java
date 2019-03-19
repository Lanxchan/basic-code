package com.itheima.demo05.System;

import java.util.Arrays;

/*
java.lang.System中提供大量静态方法,可以获取与系统相关的信息或系统级操作
public static long currentTimeMillis()  返回以毫秒为单位的当前时间
public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)  将数组中指定的数据拷贝到另一个数组中

 */
public class Demo01System {
    public static void main(String[] args) {
        demo01();
        System.out.println("---------------");
        demo02();
    }

    private static void demo02() {
        int[] a={1,2,3,4,5};
        int[] b=new int[5];
        int[] c={6,7,8,9,10};
        System.arraycopy(a,0,b,0,5);
        System.out.println(Arrays.toString(b));
        System.arraycopy(a,0,c,0,3);
        System.out.println(Arrays.toString(c));
    }

    //public static long currentTimeMillis()可以测试程序的效率
    private static void demo01() {
        long s = System.currentTimeMillis();
        for (int i = 1; i <= 9999; i++) {
            System.out.println(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("程序耗时"+(e-s)+"毫秒");
    }
}
