package cn.itcast.day11.demo07;

import java.util.ArrayList;
import java.util.List;
/*
接口作为方法的"参数"和"返回值"

java.util.list是ArrayList实现的接口

 */
public class DemoInterface {
    public static void main(String[] args) {
        //注意!左边是接口名称,右边是实现类名称
        List<String> list=new ArrayList<>();

        List<String> result=addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("abc");
        list.add("ddd");
        list.add("ccc");
        return list;
    }
}
