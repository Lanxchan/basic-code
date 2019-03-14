package cn.ticast.day10.demo02;

public interface MyInterfaceA {
    //错误
//    static {
//         静态代码块
//    }
//    public MyInterfaceA(){
//        构造方法
//    }

    public abstract void methodA();

    public abstract void methodAbs();//重复的抽象方法

    //重复的默认方法
    public default void methodDefault(){
        System.out.println("AAAAA");
    }
}
