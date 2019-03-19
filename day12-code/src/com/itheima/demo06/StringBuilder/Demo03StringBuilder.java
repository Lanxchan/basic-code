package com.itheima.demo06.StringBuilder;

public class Demo03StringBuilder {
    public static void main(String[] args) {
        String str="hello";
        StringBuilder bu = new StringBuilder(str);
        bu.append("word");
        System.out.println(bu);

        String s = bu.toString();
        System.out.println(s);
    }
}
