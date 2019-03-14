package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=a+b;
        System.out.println(res);
    }
}
