package cn.ticast.day10.demo04;

/*
代码中体现多态性,父类引用指向子类对象
子类被当作父类看待
简便易懂:
int a=10;
Object obj=a;
格式
父类名称 对象名 = new 子类名称();
或者
接口名称 对象名 = new 实现类名称();

 */
public class Demo01Polymophism {
    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用
        Fu obj = new Zi();//new的是谁就用谁的方法

        obj.method();
        obj.methodFu();

    }
}
