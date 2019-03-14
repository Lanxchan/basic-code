package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
生成6个1-33的随机整数,添加到集合,并遍历集合

 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> listA=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int num=r.nextInt(33)+1;
            listA.add(num);
        }
        //遍历集合
        for (int i = 0; i < listA.size(); i++) {
            System.out.println(listA.get(i));
        }
    }
}
