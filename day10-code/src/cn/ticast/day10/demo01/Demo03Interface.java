package cn.ticast.day10.demo01;
/*
不能通过接口实现类实例化出的对象来调用接口中的静态方法.11行
正确用法:通过"接口名称"(不是接口实现Impl),直接调用其中的静态方法

 */
public class Demo03Interface {
    public static void main(String[] args) {

        //创建了实现类对象
        MyInterfaceStaticImpl ms=new MyInterfaceStaticImpl();
        //ms.methodStatic();

        MyInterfaceStatic.methodStatic();//正确调用接口的静态方法

    }

}
