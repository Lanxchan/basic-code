package cn.itcast.day08.demo02;
/*
字符串的截取
public String substring(int index)//截取从参数的位置一直到字符串末尾
public String substring(int begin,int end)//截取[begin,end)

 */
public class Demo03StringSubString {
    public static void main(String[] args) {
        String str1="Helloworld!";
        String str2=str1.substring(5);//world!
    }
}
