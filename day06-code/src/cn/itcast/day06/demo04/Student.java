package cn.itcast.day06.demo04;

/*
构造方法是专门用来创建对象的方法,当我们通过关键字new来创建对象时,其实是在调用构造方法
格式:
public 类名称(参数类型 参数名称){
    方法体
}
注意"
1.构造方法的名称必须和所在的类名称完全一样,大小也也一样
2.构造方法>>不要写返回值,void也不要<<
3.构造方法不能return一个具体的反回值
4.如果没有编写任何构造方法,编译器会默认给出一个构造方法,没有内容
5.构造方法也可重载

 */
public class Student {
    //成员变量
    private String name;
    private int age;

    //构造方法
    //用途:创建对象
    public Student() {
        System.out.println("无参构造方法执行!");
    }
    public Student(String name,int age){
        System.out.println("有参构造方法执行!");
        this.name=name;
        this.age=age;
    }

    //getter,setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
