package cn.itcast.day08.demo03;
/*
一旦使用static修饰成员方法,就成为静态方法
不属于对象,属于类
如果没有static关键字,必须创建对象,再通过对象使用它

注意
1.静态只能访问静态.内存中先有静态,后有其他
2.静态方法中不能用this.

正确使用方法
类.静态变量//Demo01StaticField中11行
类.静态方法()//此中22行
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj1=new MyClass();//先实例化
        //再使用
        obj1.method();//成员方法

        //静态方法可以通过对象名调用,也可直接通过类名调用
        obj1.methodStatic();//可以使用,但不推荐
        MyClass.methodStatic();//正确使用static修饰的静态方法!
    }
}
