package cn.itcast.day09.demo12;

public class Zi extends Fu {
    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    public Zi(){
        System.out.println("子类构造方法");
    }
}
