package com.itheima.demo04.Calendar;

import java.util.Calendar;

/*
jaca.util.Calendar类;日历类
Calendar是一个抽象类,提供很多操作日历字段的方法(YEAR,MONTH,DAY_OF_mONTH,HOUR)
无法直接创建对象使用,用其静态方法getInstance(),该方法返回了Canendar类的子类
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();//多态
        System.out.println(cal);
    }
}
