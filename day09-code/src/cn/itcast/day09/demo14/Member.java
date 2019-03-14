package cn.itcast.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {
    }

    public void receive(ArrayList<Integer> list){
        //从多个红包中随便抽取一个
        //随机获取一个随机数作为红包的索引
        int index=new Random().nextInt(list.size());
        //根据索引,从集合中删除
        int delta = list.remove(index);
        //当前成员自己的钱数;
        int money=super.getMoney();
        super.setMoney(money+delta);

    }
}
