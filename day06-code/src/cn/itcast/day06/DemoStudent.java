package cn.itcast.day06;
//private boolean 的特殊
public class DemoStudent {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("ab");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名"+stu.getName());
        System.out.println("年龄"+stu.getAge());
        System.out.println(stu.isMale());
    }
}
