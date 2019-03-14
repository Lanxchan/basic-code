package cn.itcast.day08.demo02;
/*
String中与转换相关的方法
public char[] toCharArray()//将当前字符串拆分成为字符数组作为返回值
public byte[] getBytes()//获得当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString)
//将所有出现的字符串替换成新的字符串
CharSequence接口:可以接受字符串类型
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        //传换成字符数组
        char[] ch1="Hello".toCharArray();
        System.out.println(ch1[0]);
        System.out.println(ch1.length);
        
        //转换成字节数组
        byte[] b1="abc".getBytes();
        for (int i = 0; i < b1.length; i++) {
            System.out.println(b1[i]);
        }

        //字符串的内容替换
        String str1="How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);
    }
}
