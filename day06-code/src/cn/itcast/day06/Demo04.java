package cn.itcast.day06;

public class Demo04 {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.brand="苹果";
        one.price=8848;
        one.color="土豪金";

        method(one);
    }

    public static void method(Phone paramA){

        System.out.println(paramA.brand);
        System.out.println(paramA.color);
        System.out.println(paramA.price);
    }
}
