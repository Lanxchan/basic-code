package cn.itcast.day07.demo02;
/*
匿名对象是只有右边的对象,没有左边的名字和赋值运算符;
new 类名称();
匿名对象只能使用一次
 */
public class Demo01Anonymous {
    public static void main(String[] args) {

        Person p1=new Person();
        p1.name="aaa";
        p1.showName();

        //匿名对象,不把对象地址赋给p1
        new Person().name="bbb";

    }
}
