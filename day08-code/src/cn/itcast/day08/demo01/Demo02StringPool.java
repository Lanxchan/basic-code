package cn.itcast.day08.demo01;
/*
程序直接写双引号的字符串在 字符串常量池 中

基本数据类型,==进行 数值 比较
引用数据类型,==进行 地址值 比较
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";

        char[] c1={'a','b','c'};
        String str3=new String(c1);

        //地址比较
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
    }
}
