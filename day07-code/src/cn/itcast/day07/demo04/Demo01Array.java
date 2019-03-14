package cn.itcast.day07.demo04;

/*
数组,存储3个Person对象
数组有个缺点:一旦创建,程序运行期间长度不可以改变
 */
public class Demo01Array {
    public static void main(String[] args) {
        Person[] arr1 = new Person[3];//[3]表示初始化数组中有3个元素
        Person one = new Person("aa", 20);
        Person two = new Person("bb", 21);
        Person three = new Person("cc", 22);
        //将one中的地址赋值到0号元素中
        arr1[0]=one;
        arr1[1]=two;
        arr1[2]=three;

        System.out.println(arr1[1]);//地址值

        Person p1=arr1[1];
        System.out.println(p1.getName());

        System.out.println(arr1[1].getName());
    }
}
