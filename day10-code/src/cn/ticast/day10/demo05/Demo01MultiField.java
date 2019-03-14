package cn.ticast.day10.demo05;

public class Demo01MultiField {
    public static void main(String[] args) {
        //使用多态的写法
        Fu obj=new Zi();
        System.out.println(obj.num);//子类与父类都有num成员变量,在多态时,用父类的成员变量.显示"10"
//        System.out.println(obj.age);错误
        obj.showNum();//子类没有重写showNum()方法的话用父类的showNum()

    }
}
