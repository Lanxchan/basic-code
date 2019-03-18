package com.itheima.demo01.Object;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1=null;
        String s2="abc";
        //boolean b=s1.equals(s2);//空指针异常.null不能调用方法
        boolean b1= Objects.equals(s1,s2);//Objecss在java.util包中,要导入
        System.out.println(b1);
    }
}
