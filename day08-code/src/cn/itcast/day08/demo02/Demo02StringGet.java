package cn.itcast.day08.demo02;
/*
String获取

public int length()//字符串长度
public String concat(String str)//拼接字符串
public char charAt(int index)//获取指定索引位置的字符
public int indexOf(String str)//查找str在本字符串中首次出现的索引位置
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串长度
        int length="ajdowiqjoqhdios".length();

        //拼接
        String str="Hello ".concat("world!");

        //获取索引位置的字符
        char ch="Hello".charAt(1);

        //查找str在本字符串中首次出现的索引位置
        String str1="joiqwd";
        int a=str1.indexOf("iq");
        System.out.println(a);
    }
}
