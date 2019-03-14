package cn.itcast.day06;

public class Person {
    String name;
    private int age;//用private保护,只能用setAge(),getAge()

    public void show(){
        System.out.println("我叫"+name+",年龄"+age);
    }

    public void setAge(int age) {
        if(age<100&&age>=9){
            this.age = age;
        }else {
            System.out.println("数据不合理!");
        }
    }

    public int getAge() {
        return age;
    }
}
