package com.itheima.demo07Integer;
//自动装箱

import java.util.ArrayList;

public class Demo02Integer {
    public static void main(String[] args) {
        Integer in=1;//自动装箱,代替Demo01中的过时代码

        in=in+2;//自动拆箱+自动装箱

        ArrayList<Integer> list=new ArrayList<>();
        /*
        ArrayList集合无法直接存储整数,可以存储Integer包装类
         */

        list.add(1);//自动装箱 list.add(new Integer(1));

        int a=list.get(0);//get(0)返回的是Integer,产生自动拆箱list.get(0).intValue()



    }
}
