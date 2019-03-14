package cn.itcast.day06.demo05;
/*
一个标准的类:
1.所有的成员变量都要使用private
2.每个成员变量编写一对getter,setter
3.编写一个无参构造方法
4.编写一个有参构造方法

标准的类也叫做Java Bean
 */
public class Student {
    private String name;//姓名
    private int age;//年龄

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
