package cn.itcast.day11.demo08;

import cn.itcast.day11.red.OpenMode;

/*
抢红包

 */
public class Bootstrap {
    public static void main(String[] args) {
        MyRed myRed=new MyRed("java课程");
        //设置群主名称
        myRed.setOwnerName("abc");
        //设置分发策略,平均红包
//        OpenMode normal=new NormalMode();
//        myRed.setOpenWay(normal);

        //设置分发策略,随机红包
        OpenMode random=new RandomMode();
        myRed.setOpenWay(random);
    }
}
