package cn.itcast.day09.demo07;

public class Zi extends Fu {
    public Zi(){
        //super();在调用父类无参构造方法
        super(20);//在调用父类有参构造方法
        System.out.println("子类构造方法");
    }
}
