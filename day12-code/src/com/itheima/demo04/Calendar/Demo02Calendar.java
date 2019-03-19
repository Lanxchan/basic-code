package com.itheima.demo04.Calendar;

import java.util.Calendar;
import java.util.Date;

/*
Calendar类常用成员方法
    public int get(int field)   返回给定日历字段的值
    public void set(int field,int value)    将给定日历字段设置为给定值
    public abstract void add(int field,int amount)  根据日历规则,为给定的日历字段添加或减去指定的时间量
    public Date getTime()   返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象.如Tue Mar 19 16:57:36 CST 2019
成员方法的参数 int field:日历类的字段,可以使用Calendar类的静态成员变量获取
YEAR = 1
MONTH = 2
DATE = 5
DAY_OF_MONTH = 5    和 DATE 一样,用哪个都行
HOUR = 10
MINUTE = 12
SECOND = 13

 */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        System.out.println("------------");
        demo02();
        System.out.println("------------");
        demo03();
        System.out.println("------------");
        demo04();

    }

    private static void demo04() {
        Calendar c=Calendar.getInstance();
        Date time = c.getTime();
        System.out.println(time);
    }

    private static void demo03() {
        Calendar c=Calendar.getInstance();

        c.add(Calendar.YEAR,2);
        System.out.println(c.get(Calendar.YEAR));
        c.add(Calendar.MONTH,-2);
        System.out.println(c.get(Calendar.MONTH));
    }

    private static void demo02() {
        Calendar c=Calendar.getInstance();
        //Calendar是语言敏感型抽象方法,用以上方式实例化对应语言的Calendar对象.不new

        c.set(Calendar.YEAR,9999);
        System.out.println(c.get(Calendar.YEAR)+"年");
        c.set(Calendar.MONTH,9);
        System.out.println(c.get(Calendar.MONTH)+1+"月");
        c.set(Calendar.DAY_OF_MONTH,9);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        c.set(8888,8,8);
        //set有很多重载


    }

    private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month=c.get(Calendar.MONTH);//西方月份0-11
        System.out.println(month+1);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date+"日");
    }
}
