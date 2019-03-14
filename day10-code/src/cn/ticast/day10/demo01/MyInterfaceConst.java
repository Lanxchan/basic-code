package cn.ticast.day10.demo01;
/*
接口的 成员变量Const
1.必须用public static final三个关键字进行修饰
即接口的常量
2,接口中的常量必须赋值
3.常量名称要大写

public static final 数据类型 常量名 = 数据值;

final关键字修饰的都不可改变
可以省略public static final

 */
public interface MyInterfaceConst {
    //其实是常量,无法修改
    public static final int NUM_OF_MY_CLASS=10;


}
