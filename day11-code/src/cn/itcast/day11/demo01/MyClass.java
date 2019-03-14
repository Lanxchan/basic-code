package cn.itcast.day11.demo01;
/*
当final关键字修饰一个类
格式:
public final class 类名{
    //...
   }
当前这个类不能有任何子类
其他的东西和普通类一样
一个类如果是final,其所有方法无法被重写

 */
public final class MyClass {
    public void method(){
        System.out.println("方法执行");
    }
}
