package cn.itcast.day09.demo02;

public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu f=new Fu();
        System.out.println(f.numFu);

        Zi z=new Zi();
        System.out.println(z.numFu);
        System.out.println(z.numZi);

        //等号左边是谁就优先用谁,直接访问
        System.out.println(z.num);//优先用子类


    }
}
