package cn.itcast.day09.demo14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager ma=new Manager("群主",100);
        Member me1=new Member("成员A",0);
        Member me2=new Member("成员B",0);
        Member me3=new Member("成员C",0);
        ma.show();
        me1.show();
        me2.show();
        me3.show();
        System.out.println();

        ArrayList<Integer> redlist=ma.send(20,3);

        me1.receive(redlist);
        me2.receive(redlist);
        me3.receive(redlist);

        ma.show();
        me1.show();
        me2.show();
        me3.show();
        System.out.println();
    }
}
