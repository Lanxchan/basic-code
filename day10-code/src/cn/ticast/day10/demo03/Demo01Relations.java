package cn.ticast.day10.demo03;
/*
接口之间的>>多继承<<
1.类与类之间是单继承
2.类与接口之间多实现,一个类可以实现多个接口
3.一个接口能继承多个接口,用","隔开

注意
1.多个父接口中的抽象方法重复,没关系.public abstract void methodCommon();因为其中没有内容,并且语句完全一样
2.多个父接口中的默认方法重复,需要重写.public default void methodDefault(){ }因为其中的内容会不一样

 */
public class Demo01Relations {
}
