package cn.ticast.day10.demo01;
/*
接口能定义抽象方法:
public abstract 返回值类型 方法名称(参数列表);
接口中的抽象方法,修饰符必须是两个固定的关键字:public abstract
这两个关键字可以选择性的省略
 */
public interface MyInterfaceAbstract {
    public abstract void methodAbs1();
    abstract void methodAbs2();
    public void methodAbs3();
    void methodAbs4();
    //以上都一样,public abstract可以省略,无论如何始终是public abstract
    //public abstract是灰色的,表示可以不写
}
