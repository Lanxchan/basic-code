package cn.itcast.day07.demo01;

import java.util.Scanner;

/*
Scanner类,键盘输入数据到程序
引用类型使用:
1.导包 import 包路径.类名称;
如果要使用的类在当前类,可省略
2.创建
类名称 对象名=new 类名称;
3.使用
对象名.方法名();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //system.in从键盘输入
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//输入数字
        System.out.println("输入的数字是"+a);

        String str=sc.next();//输入字符串
        System.out.println("输入的字符串是:"+str);

    }
}
