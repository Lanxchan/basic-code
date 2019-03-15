package cn.itcast.day11.demo04;
/*
局部内部类
在一个方法内部,定义一个"类"
不能写权限修饰符public,private,protected

 */
public class Outer {
    public void methodOuter(){
        //局部内部类
        class Inner{
            int num=10;
            public void methodInner(){
                System.out.println(num);
            }
        }

        //使用局部内部类
        Inner inner=new Inner();
        inner.methodInner();
    }
}
