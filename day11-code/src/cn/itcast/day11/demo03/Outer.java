package cn.itcast.day11.demo03;
/*
内部类的同名变量访问

 */
public class Outer {//与inner相对
    int num=10;//外部类的成员变量

    public class Inner{
        int num=20;//内部类的同名成员变量

        public void methodInner(){
            int num=30;//内部类的局部变量
            System.out.println(num);
            System.out.println(this.num);//光标放到num上就能看到对应的num
            System.out.println(Outer.this.num);//外部类的成员变量
        }
    }
}
