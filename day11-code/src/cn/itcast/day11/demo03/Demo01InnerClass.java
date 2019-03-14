package cn.itcast.day11.demo03;
/*
内部类
1.成员内部类
public class 类名称{
    public class 类名称{

        }
 }
 内用外,随意访问
 外用内,借助内部类对象

2.局部内部类,匿名内部类

 */
public class Demo01InnerClass  {
    public static void main(String[] args) {
        Body body=new Body();
        body.methodBody();//第一种调用内部类

        //第二种调用内部类
        Body.Heart heart=new Body().new Heart();
        heart.beat();
    }
}
