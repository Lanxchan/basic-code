package cn.itcast.day11.demo01;
/*
final修饰一个 方法 时,这个方法不能被子类重写
public final void method(){
    //...
}
 */
public class Fu {
    public void method(){
        System.out.println("父类方法执行");
    }
}
