package com.itheima.demo07Integer;
/*
基本类型与字符串类型之间的转换
基本类型->字符串(String)
    1.基本类型+""
    2.包装类的静态方法toString(),不是Object类的toString()重载
    3.String类的静态方法valueOf(int i)重载,把各种类型的数据转换成String类型
字符串(String)->基本类型
    使用包装类的静态方法parseXXX("...");
    static int parseInt(String s)
    static double parseDouble(String s)
    ...

 */
public class Demo03Integer {
    public static void main(String[] args) {
        //基本数据类型->String
        int i1=100;
        String s1=i1+"";
        System.out.println(s1+200);

        String s2 = Integer.toString(200);
        System.out.println(s2+200);

        String s3 = String.valueOf(300);
        System.out.println(s3+200);

        //String->基本数据类型
        int i=Integer.parseInt(s1);
        System.out.println(i-10);
    }

}
