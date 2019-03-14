package cn.itcast.day11.demo01;
/*
全局变量使用final修饰,后不能改变
成员变量有默认值,使用final后必须手动赋值,不再给默认值
需要在所有的,有参无参,构造方法中给其赋值
setName(...)就不能有了
 */
public class Person {
    private final String name;//构造方法中都给其赋值,所以不会报错


    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Person() {
        this.name="aaa";
    }

    public Person(String name) {
        this.name = name;
    }
}
