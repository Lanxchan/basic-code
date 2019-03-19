package com.itheima.demo06.StringBuilder;
/*
java.long.StringBuilder类.字符缓冲区,可以提高字符的效率
构造方法:
    StringBuilder()  容量16个字符
    StringBuilder(String str)构造一个字符串生成器,并初始化为指定字符串内容
成员方法:
    public StringBuilder append(...)添加任意类型数据的字符串形式
    public String toString()  将当前StringBuilder对象转换为String对象

 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        //bu1为空
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println(bu2);
    }
}
