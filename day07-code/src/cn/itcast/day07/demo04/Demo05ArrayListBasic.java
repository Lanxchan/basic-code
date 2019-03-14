package cn.itcast.day07.demo04;

import java.util.ArrayList;
/*
向ArrayList中存储 基本数据类型 必须使用基本类型对应的"包装类"
基本类型     包装类(引用类型,包装类都在java.long包下)
byte            Byte
short           Short
int             Integer
long            Long
float           Float
double          Double
char            Character
boolean         Boolean
从JDK 1.5开始,支持自动装箱,自动拆箱
自动装箱,基本类型->包装类型
自动拆箱,包装->基本
 */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA=new ArrayList<>();
//        ArrayList<int>错误,泛型只能是引用数据类型

        ArrayList<Integer> listB=new ArrayList<>();
        listB.add(100);
        listB.add(200);
        System.out.println(listB);

        //获取
        int num=listB.get(1);
        System.out.println(num);
    }
}
