package cn.itcast.day06.demo05;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("aa");
        stu1.setAge(20);
        System.out.println("姓名"+stu1.getName()+",年龄"+stu1.getAge());

        Student stu2=new Student("bb",21);
        System.out.println("姓名"+stu2.getName()+",年龄"+stu2.getAge());

    }
}
