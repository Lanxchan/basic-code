package cn.itcast.day08.demo02;

import java.util.Scanner;

/*
键盘输入字符串,统计其中各种出现的字符次数

 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();

        int countUpper=0;//大写字母
        int countLower=0;//小写字母
        int countNum=0;//数字
        int countOther=0;//其他

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
            if('A'<=ch&&ch<='Z'){
                countUpper++;
            }else if ('a'<=ch&&ch<='z'){
                countLower++;
            }else if ('0'<=ch&&ch<='9'){
                countNum++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母"+countUpper+"个");
        System.out.println("小写字母"+countLower+"个");
        System.out.println("数字"+countNum+"个");
        System.out.println("其他字符"+countOther+"个");
    }
}
