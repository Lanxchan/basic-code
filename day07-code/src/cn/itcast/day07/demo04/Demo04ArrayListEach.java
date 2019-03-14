package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> ali=new ArrayList<>();
        ali.add("aa");
        ali.add("bb");
        ali.add("cc");

        //遍历集合
        //ali.fori不用ali.size().fori
        for (int i = 0; i < ali.size(); i++) {
            System.out.println(ali.get(i));
        }
    }
}
