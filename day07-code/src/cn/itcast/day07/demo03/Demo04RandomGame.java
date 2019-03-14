package cn.itcast.day07.demo03;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

/*
随机数猜数字
 */
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randNum = r.nextInt(100) + 1;
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("输入");
            int guessNum = sc.nextInt();
            if (randNum < guessNum) System.out.println("大重试");
            else if (guessNum < randNum) System.out.println("小重试");
            else {
                System.out.println("猜中");
                break;
            }
        }
        System.out.println("结束");
    }
}
