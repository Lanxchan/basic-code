package cn.ticast.day10.demo03;
/*
这个字接口有4个方法

 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void method();//自身的抽象方法

    //其中没有显示的AB两个父接口中有重复的public abstract void methodCommon();
    //不用重写

    //重复的默认方法,需要重写,default不能省略
    @Override
    default void methodDefault() {

    }


}
