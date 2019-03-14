package cn.itcast.day08.demo03;

public class Student {
    private int id;//自动生成
    private String name;
    private int age;
    static String room;
    private static int idCounter=0;//计数器

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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idCounter;//自动生成id
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(){
        this.id=++idCounter;//自动生成id
    }
}
