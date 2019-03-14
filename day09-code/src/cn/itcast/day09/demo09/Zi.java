package cn.itcast.day09.demo09;

/*
super关键字用来访问父类内容,this关键字用来访问本类内容

1.在本类的成员方法,中访问本类的成员变量
2.在本类的成员方法,访问本类的另一个成员方法
3.在本类的构造方法中,访问本类的另一个构造方法
 this(...)调用也必须是构造方法的第一个语句,此时super();就不是第一个,所以super()和this()不能同时使用
 */
public class Zi extends Fu {
    int num = 20;

    public Zi(){
//        this();//自己调用自己
        this(123);//本类的无参构造,调用本类的有参构造3.
    }

    public Zi(int n){
        this(1,2);//可以使用
    }

    public Zi(int n,int m){
        //this();//此类中错误,造成循环
    }
    public void showNum() {
        int num = 10;
        System.out.println(num);//局部变量
        System.out.println(this.num);//成员变量1.
        System.out.println(super.num);//父类的成员变量

    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        this.methodA();//2.
        System.out.println("BBB");
    }
}
