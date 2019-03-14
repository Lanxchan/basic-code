package cn.ticast.day10.demo01;
/*
接口就是多个类的公共规范
接口是一种引用数据类型,最重要的内容是:抽象方法

public interface 接口名称{

}
.java-->.class
接口中可以有
1.常量
2.抽象方法
3.默认方法
4.静态方法
5.私有方法

接口不能直接使用,必须有一个"实现类"来实现该接口
格式:
public class 实现类名称 implements 接口名称{

}

接口的实现类必须 重写 接口中 所有 的抽象方法

注意:
如果实现类没有 重写 接口中的所有抽象方法,那么这个实现类自己必须是抽象类

 */
public class Demo01Interface {
    public static void main(String[] args) {
        //接口要使用其实现类,即后缀Impl的类
        MyInterfaceAbstractImpl impl=new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
    }
}
