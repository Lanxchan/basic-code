package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
ArrayList集合的长度可以改变
数组的长度不可以改变

ArrayList<E>表示泛型,在集合中的所有元素,都是统一的类型
!!泛型只能是引用类型,不能是基本类型

!!对于ArrayList集合,直接打印的不是地址值,而是内容
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
//        从JDK 1.7开始,右侧的<>内部可以不写内容,但是<>本身要写
        ArrayList<String> ali = new ArrayList<>();

        //向集合中添加数据
        ali.add("aa");
        ali.add("bb");
        ali.add("大家好");
        System.out.println(ali);
    }
}
