package cn.itcast.day09.demo05;
/*
方法重写注意
1.方法名称相同,参数列表相同
@Override  写在方法方法前面,用来检测是否是有效重写
这个注解就算不写,只要满足要求,也是重写
2.子类方法的返回值必须 <= 父类方法的返回值范围
Object类是所有类的公共最高父类
3.子类方法的权限必须 >= 父类方法的权限修饰符
public > protected > 不写 > private
 */
public class Demo01Override {
}
