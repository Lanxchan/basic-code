package cn.ticast.day10.demo02;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("重写了A的抽象方法");
    }

    //重写重复的抽象方法
    @Override
    public void methodAbs() {
        //重复的方法
        System.out.println("重写了一次AB重复的抽象方法");
    }

    //重写重复的默认方法
    @Override
    public void methodDefault() {
        System.out.println("对多个接口中重复的默认方法重写");
    }


    @Override
    public void methodB() {
        System.out.println("重写了B的抽象方法");
    }
}
