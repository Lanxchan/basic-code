package cn.itcast.day06;
/*
局部变量没有默认值
全局(成员)变量如果没有赋值,会有默认值
 */
public class DemoVariableDifference {
    String name;//全局(成员)变量

    public void methodA(){
        int num=20;//局部变量
    }
}
