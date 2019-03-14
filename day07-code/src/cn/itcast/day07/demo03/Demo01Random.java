package cn.itcast.day07.demo03;
/*
Random
int num=r.nextInt(3)
[0,3) 0,1,2
 */

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println(num);
        int num1=r.nextInt(3);
        System.out.println(num1);
    }

}
