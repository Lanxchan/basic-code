package cn.itcast.day06;

public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //boolean基本数据类型的set,is方法与其他不同
    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }
}
