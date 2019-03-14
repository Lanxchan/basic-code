package cn.ticast.day10.demo06;

public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型
        Animal ani=new Cat();
        ani.eat();

        //向下转型
        Cat c=(Cat)ani;
        c.catchMouse();//调用子类特有方法

        //错误的向下转型
        Dog d=(Dog)ani;//ani是从Cat转型的,现在要向下转型成狗
        //编译无异常,但运行出错


    }
}
