package cn.itcast.day08.demo04;

import java.util.Arrays;

/*
用Arrays相关的API,将一个随机字符串中的所有字符升序排列,并倒序打印

 */
public class Demo02ArraysPractice {
    public static void main(String[] args) {
        String str="ajowdiqwe12389178ta671";

        //升序
        //先要是一个数组
        char[] chars = str.toCharArray();//变成字符数组!!
        Arrays.sort(chars);

        //倒序遍历
        //chars.forr倒序,reverse
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
