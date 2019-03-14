package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0,inp;
        for (int i = 0; i < 3; i++) {
            inp=sc.nextInt();
            if(max<inp)max=inp;
        }
        System.out.println(max);
    }
}
