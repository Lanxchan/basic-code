package com.itheima.demo01.Object;

import java.util.Objects;

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
//Demo01用,Demo02不用
    /*@Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }*/

    //Demo02Equals使用,Demo01不用
/*    @Override
    public boolean equals(Object obj) {
        if (obj==null){
            return false;//提高程序效率
        }
        if(obj==this){
            return true;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;
            //比较两个对象的属性,一个对象是this(p1),一个对象是p(obj->p2)
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        return super.equals(obj);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;//使用反射技术,判断o是否是Person类型,等效于obj instanceof Person
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }
}
