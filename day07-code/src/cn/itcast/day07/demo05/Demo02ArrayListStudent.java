package cn.itcast.day07.demo05;

import java.util.ArrayList;

/*
自定义4个学生对象,添加到集合,并遍历
 */
public class Demo02ArrayListStudent {

    public static void main(String[] args) {
        ArrayList<Student> listA=new ArrayList<>();
        Student s1=new Student("aa",20);
        Student s2=new Student("bb",21);
        Student s3=new Student("cc",22);
        Student s4=new Student("dd",23);

        listA.add(s1);
        listA.add(s2);
        listA.add(s3);
        listA.add(s4);

        //遍历集合
        for (int i = 0; i < listA.size(); i++) {
            Student stu=listA.get(i);
            System.out.println(stu.getName()+" "+stu.getAge());
        }
    }
}
