package cn.itcast.day06;
/*
用private关键字将需要保护的成员变量进行修饰
使用private,本类中可以使用
超出本类不能直接访问
 */
public class DemoPerson {
    public static void main(String[] args) {
        Person ps=new Person();
        ps.show();

        ps.name="zly";
        //ps.age=20;不能直接访问
        ps.setAge(-20);//间接访问

    }

}
