package cn.itcast.day04.demo01;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("HelloWorld!!!111");
        System.out.println("HelloWorld!!!222");

        //sum(1, 2);
        int[] arrayA={10,20,30};
        System.out.println(arrayA[1]);

    }

    public static void sum(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }
}
