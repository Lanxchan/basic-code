package cn.ticast.day10.demo01;
/*
私有方法
需要抽取一个公共方法,用来解决两个默认方法之间重复的代码
公共方法不能让实现类使用,应该是私有化的

1.普通私有方法,解决多个默认方法之间重复代码
private 返回值类型 方法名称(参数列表){
    方法体
}
2.静态私有方法,........静态方法............
private static 返回值类型 方法名称(参数列表){
    方法体
}
 */
public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommon();
    }

    public default void methodDefault2(){
        System.out.println("默认方法2");
        methodCommon();
    }

    //私有方法,只有本类可以使用.实现本类的MyInterfacePrivateAImpl不能使用
    private void methodCommon(){
        System.out.println("AAAAAA");
        System.out.println("BBBBBB");
        System.out.println("CCCCCC");
    }
}
