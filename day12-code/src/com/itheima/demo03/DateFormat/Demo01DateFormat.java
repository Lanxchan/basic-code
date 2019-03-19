package com.itheima.demo03.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat;日期/时间格式化子类的抽象类
作用:
    格式化(日期->文本) 解析(文本->日期)
成员方法:
    String format(Date date) 按照指定的模式,把Date日期,格式化符合模式的字符串
    Date parse(String source) 与上相反
DateFormat类是一个抽象类,用其子类
java.text.SimpledateFormat extends DateFormat
    SimpleDateFormat(String pattern)
    y   年
    M   月
    d   日
    H   时
    m   分
    s   秒
"yyyy-MM-dd HH:mm:ss"   模式中的字母不能改,但连接符号可以改变

 */
public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
        demo01();

        demo02();
    }

    private static void demo01() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String d = sdf.format(date);//把当前时间date放入format方法中来格式化
        System.out.println(date);
        System.out.println(d);
    }

    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2019-03-18 20:36:17");
        System.out.println(date);
    }
}
