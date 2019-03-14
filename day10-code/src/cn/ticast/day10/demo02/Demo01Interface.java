package cn.ticast.day10.demo02;
/*
使用接口时,需要注意
1.接口是没有静态代码块或者构造方法的,因为有构造方法就能new出来,但是接口不能new来直接使用
2.一个类的直接父类是唯一的,但是一个类可以同时实现多个接口
格式
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
    //重写所有抽象方法
}
3.如果实现类所实现的多个接口中,存在重复的抽象方法,只需重写一次
4.如果实现类没有重写所有接口的所有抽象方法,则实现类必须是抽象类.MyInterfaceAbstract
5.如果实现类实现的多个接口中,存在重复的默认方法,那么实现类要对重复的默认方法重写
6.一个类直接父类中的方法,和接口中的默认方法重复,优先使用父类的方法.Fu,Zi,MyInterface

 */
public class Demo01Interface {
    public static void main(String[] args) {
        Zi z=new Zi();
        z.method();//6.
    }
}
