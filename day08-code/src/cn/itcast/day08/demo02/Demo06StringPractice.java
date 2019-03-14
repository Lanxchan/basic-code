package cn.itcast.day08.demo02;
/*
定义一个方法,把数组{1,2,3}按照指定格式拼接成一个字符串

 */
public class Demo06StringPractice {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};

        System.out.println(fromArrayToString(a));
    }

    public static String fromArrayToString(int[] array){
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                str+="word"+array[i]+"]";
            }else {
                str += "word" + array[i] + "#";
            }

        }
        return str;
    }
}
