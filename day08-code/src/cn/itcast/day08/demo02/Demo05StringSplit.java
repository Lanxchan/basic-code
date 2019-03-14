package cn.itcast.day08.demo02;
/*
分割字符串
public String[] split(string regex),按照参数的规则,将字符串切分成若干

注意
split方法的参数regex是"正则表达式"
用"."切分,写 \\.
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1="aaa,bbb,ccc";
        String[] strarr = str1.split(",");
        for (int i = 0; i < strarr.length; i++) {
            System.out.println(strarr[i]);
        }

        String str2="aaa bbb ccc";
        String[] strarr1 = str2.split(" ");
        for (int i = 0; i < strarr1.length; i++) {
            System.out.println(strarr1[i]);
        }

    }
}
