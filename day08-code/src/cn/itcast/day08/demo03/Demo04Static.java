package cn.itcast.day08.demo03;
/*
静态内容优先于非晶态,所以静态代码块比构造方法先执行
 静态代码块的典型用途:
 用来一次性的对静态成员变量进行赋值
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person one=new Person();
        Person two=new Person();
        //运行看结果:new了2个,但静态代码块只执行了一次
    }
}
