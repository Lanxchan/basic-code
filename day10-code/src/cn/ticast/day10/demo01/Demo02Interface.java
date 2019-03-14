package cn.ticast.day10.demo01;
/*
1.接口的默认方法,可以通过接口实现类对象,直接调用
2.接口的默认方法,也可以被接口实现类重写.DefaultB

 */
public class Demo02Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceDefaultA a=new MyInterfaceDefaultA();
        a.methodAbs();

        a.methodDefault();//调用默认方法

        MyInterfaceDefaultB b=new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();

    }
}
