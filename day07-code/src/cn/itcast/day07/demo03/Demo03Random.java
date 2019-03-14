package cn.itcast.day07.demo03;

import java.util.Random;

/*
[1,n]
1-n r.nextInt()+1;
0-n-1 r.nextInt();

 */
public class Demo03Random {
    public static void main(String[] args) {
        int num=5;
        Random r=new Random();
        int res=r.nextInt(num)+1;
        //[1,6)
        System.out.println(res);
    }
}
