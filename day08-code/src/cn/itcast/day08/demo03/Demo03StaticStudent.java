package cn.itcast.day08.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        //首先设置教室,room为静态变量,通过类名称调用
        Student.room = "101教室";

        Student one=new Student("aa",20);
        Student two=new Student("bb",22);


    }
}
