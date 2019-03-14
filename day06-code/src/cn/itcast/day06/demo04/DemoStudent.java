package cn.itcast.day06.demo04;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu=new Student();//new创建的就是构造方法,无参构造方法

        Student stu2=new Student("aa",20);//有参构造方法
        System.out.println("姓名"+stu2.getName()+",年龄"+stu2.getAge());
    }
}
