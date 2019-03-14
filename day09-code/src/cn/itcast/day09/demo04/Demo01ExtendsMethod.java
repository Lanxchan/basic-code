package cn.itcast.day09.demo04;
/*
在父子类的继承关系中,创建子类对象,访问成员方法的规则
创建的对象是谁,就优先用谁Zi z=new Zi().创建的Zi,优先用Zi
 */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi z=new Zi();

        z.methodFu();
        z.methodZi();

        z.method();//优先用Zi类中的
    }
}
