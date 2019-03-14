package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
已指定格式打印集合,ArrayList作为参数
 */
public class Demo02ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> listA=new ArrayList<>();
        listA.add("aa");
        listA.add("bb");
        listA.add("cc");
        System.out.println(listA);

        printArrayList(listA);
    }

    public static void printArrayList(ArrayList<String> listA){//ArrayList<String>不能忘
        System.out.print("{");//不换行
        for (int i = 0; i < listA.size(); i++) {
            String name=listA.get(i);
            if(i==listA.size()-1) System.out.println(name+"}");//换行
            else System.out.print(name+"@ ");//不换行

        }

    }
}
