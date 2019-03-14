package cn.ticast.day10.demo02;

public abstract class MyInterfaceAbstract implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {

    }

    //重写重复的抽象方法
    @Override
    public void methodAbs() {

    }

    //重写重复的默认方法
    @Override
    public void methodDefault() {

    }

    //没有methodB(){}
}
