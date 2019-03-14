package cn.itcast.day08.demo01;

/*
java程序中所有的双引号字符串,都是String类的对象
字符串的特点
1.字符串的内容是常量,创建后不能更改
2.字符串是char[]字符数组
3.字符串可以共享使用

创建字符串的方式
3种构造方法
public String();创建一个空白字符串
public String(char[] array) 根据字符数组的内容,创建字符串
public String(byte[] array)     字节           .........


 */
public class Demo01String {
    public static void main(String[] args) {
        //使用无参构造
        String str1 = new String();

        //根据字符数组,构造
        char[] c1 = {'A', 'B', 'C'};
        String str2 = new String(c1);

        //    字节     构造
        byte[] b1 = {97,98,99};//ASCII码
        String str3=new String(b1);

        //直接创建
        String str4="abc";
    }
}
