package cn.itcast.day11.demo01;
/*
final关键字,表示最终不可改变的
用法:
1.修饰一个类
2.修饰一个方法
3.修饰局部变量
4.修饰全局变量

 */
public class Demo01Final {
    public static void main(String[] args) {
        //局部变量
        final int num1=100;//不能被修改了

        final int num2;
        num2=200;

        Student stu1=new Student("aaa");
        System.out.println(stu1);//@后面的是地址值
        stu1=new Student("bbb");
        System.out.println(stu1);

        final Student stu2=new Student("ccc");
        //final修饰后,stu2的地址值不能改变
//        stu2=new Student("ddd");错误

        //内容可以改变
        stu2.setName("ddd");
        System.out.println(stu2.getName());

    }
}
