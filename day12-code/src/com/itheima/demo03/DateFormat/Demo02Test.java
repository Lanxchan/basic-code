package com.itheima.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
使用日期时间相关的API,计算出一个人已经出生了多少天
分析
把获取到的日期转为毫秒值,x1000
把当前的日期转换为毫秒值,x1000
把两个毫秒的差值转换为天(s/1000/60/60/24)
Date d;
d.getTime();把时间转换成毫秒值的方法
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入生日");
        String birthdayDateString = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);
        long birthdayDateTime = birthdayDate.getTime();
        long todayTime=new Date().getTime();//今天的时间newDate(),直接".getTime()"转换成long类型的毫秒值
        long time=todayTime-birthdayDateTime;
        System.out.println(time/1000/60/60/24);
        System.out.println(new Date());
    }
}
