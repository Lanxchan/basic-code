package com.itheima.demo07Integer;
/*
包装类
装箱
    构造方法
    new Integer(int value)
    new Integer(String s)   s="100"  s不能是"abc"之类
    静态方法
    static Integer valueOf(int i)
    static Integer valueOf(String s)
    成员方法
    int intValue()  Integer转换成int
现在程序自动装箱 =
 */
public class Demo01Integer {
    public static void main(String[] args) {
        Integer in1=new Integer(1);//横线说明方法过时

        Integer in2 = new Integer("1");

        Integer in3=Integer.valueOf(1);

        Integer in4=Integer.valueOf("123");

        int num=in2.intValue();
    }
}
