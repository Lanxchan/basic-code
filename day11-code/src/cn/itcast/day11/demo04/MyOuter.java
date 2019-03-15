package cn.itcast.day11.demo04;
/*
局部内部类访问所在方法的"局部变量",局部变量需要加上final

 */
public class MyOuter {
    public void methodOuter(){
        final int num=10;//final必须加上

        class MyInner{
            public void methodInner(){
                System.out.println(num);//局部内部类的方法访问局部内部类所在的方法中的局部变量Num

            }
        }
    }
}
