package cn.ticast.day10.demo03;

public interface MyInterfaceA {
    public abstract void methodA();

    //重复的抽象方法
    public abstract void methodCommon();

    //重复的默认方法
    public default void methodDefault(){
        System.out.println("AAA");
    }
}
