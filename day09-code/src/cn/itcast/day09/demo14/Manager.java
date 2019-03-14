package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class Manager extends User {
    public Manager(){}

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //用集合存储红包金额
        ArrayList<Integer> redList=new ArrayList<>();
        //首先看群主有多少钱
        int leftMoney=super.getMoney();
        if (totalMoney>leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        //扣钱
        super.setMoney(leftMoney-totalMoney);
        //发红包平均拆分成count份
        int avg=totalMoney/count;
        int mod=totalMoney%count;//余数
        //余数放到最后的红包中
        for (int i = 0; i < count-1; i++) {//注意-1,不处理最后一个
            redList.add(avg);
        }
        //最后一个红包单独处理
        int last=avg+mod;
        redList.add(last);
        return redList;
    }
}
