package cn.itcast.day07.demo02;

import java.util.Scanner;

/*
使用匿名对象传参
 */
public class Demo02Anonymous {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        System.out.println("输入的是" + num);

        methodParam(new Scanner(System.in));

        Scanner sc=methodReturn();
        int num1=sc.nextInt();
        System.out.println("输入的是"+num1);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是" + num);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
