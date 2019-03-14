package cn.itcast.day08.demo04;
/*
java.util.Math数学相关的工具类,提供大量静态方法

public static double abs(double num)//获取绝对值
public static double ceil(double num)//向上取整
public static double floor(double num)//向下取整
public static long round(double num)//四舍五入

Math.PI常量
 */
public class Demo03Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));

        //向上取整
        System.out.println(Math.ceil(3.999));
        System.out.println(Math.ceil(3.0));

        //向下取整
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.0));

        //四舍五入
        System.out.println(Math.round(4.3));
        System.out.println(Math.round(50.5));

        double pi=Math.PI;
    }
}
