package cn.itcast.day11.demo04;

/*
使用局部内部类

 */
public class DemoMain {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.methodOuter();//其中调用了局部内部类

    }
}
