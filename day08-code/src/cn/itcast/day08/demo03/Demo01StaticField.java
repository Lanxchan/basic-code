package cn.itcast.day08.demo03;

/*
如果一个成员变量使用了static关键字,那么这个变量不再属于对象自己,而是属于所在的类.多个对象共享同一个数据
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("aa", 20);
        Student two = new Student("bb", 22);
        one.room = "101教室";//static修饰,room要自己打出来,不会提示.不推荐
//        Student.room="101教室";//正确使用static修饰的静态变量!

        System.out.println(one.getId() + " " +
                one.getName() + " " +
                one.getAge() + " " +
                one.room);
        System.out.println(two.getId() + " " +
                two.getName() + " " +
                two.getAge() + " " +
                two.room);


    }
}
