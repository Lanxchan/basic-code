package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/*
返回值:ArrayList
用一个大集合存入20个随机数,筛选其中的偶数,放到小集合
用自定义方法实现筛选
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            listA.add(r.nextInt(100)+1);

        }

        ArrayList<Integer> smallList=getSmallList(listA);
        System.out.println(smallList);
        System.out.println("偶数有"+smallList.size()+"个");
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> listA){
        ArrayList<Integer> listB=new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            int num=listA.get(i);
            if(num%2==0){
                listB.add(num);
            }
        }
        return listB;
    }

}
