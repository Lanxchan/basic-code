package com.itheima.demo02.Date;

import java.util.Date;

/*
CST中国标准时间,北京时间

 */
public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        //把日期转换成毫秒
        Date date=new Date();
        System.out.println(date.getTime());
        //相当于System.currentTimeMillis();
    }

    private static void demo02() {
        //把毫秒值转换为Date日期
        Date date = new Date(0L);
        System.out.println(date);
    }

    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }
}
