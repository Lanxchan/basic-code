package cn.itcast.day08.demo04;

import java.util.Arrays;

/*
java.util.Arrays是一个与数组相关的工具类,里面提供了大量的静态方法,用来实现数组常见的操作

public static String toString(数组)//将参数数组变成字符串
public static void sort(数组)//按照默认升序对数组的元素进行排序

如果是数值,sort默认按照升序
如果是字符串,sort默认按照字母升序
!!如果是自定义类型,那么这个自定义的类需要有Comparable或者Comparator接口
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray={10,20,30};
        String intStr= Arrays.toString(intArray);//变换成默认格式[10, 20, 30]
        System.out.println(intStr);

        int[] array1={5,2,3,89};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2={"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
