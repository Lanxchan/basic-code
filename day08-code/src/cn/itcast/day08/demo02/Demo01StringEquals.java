package cn.itcast.day08.demo02;
/*
对字符串内容比较:
public boolean equals(Object obj)

推荐:"abc".equals(str)
str=null;
str.equals("abc")//空指针异常NullPointerException

public boolean equalsIgnoreCase(String str)//忽略大小写进行比较

 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        char[] charArray={'H','e','l','l','o'};
        String str3=new String(charArray);

        System.out.println(str1.equals(str2));//比较内容
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        System.out.println("Java".equals("java"));
        System.out.println("Java".equalsIgnoreCase("java"));
    }
}
