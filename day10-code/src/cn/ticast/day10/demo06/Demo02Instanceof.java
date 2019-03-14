package cn.ticast.day10.demo06;
/*
一个父类引用对象,本来是什么子类
格式
对象 instanceof 类型
return [bolean]  判断前面的对象能不能"当作"后面类型的实例

 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal ani=new Cat();
        ani.eat();

        giveMeAPet(ani);

    }

    public static void giveMeAPet(Animal ani){
        // instanceof的使用
        if(ani instanceof Dog){
            Dog d=(Dog)ani;
            d.watchHouse();
        }

        if(ani instanceof Cat){
            Cat c=(Cat)ani;
            c.catchMouse();
        }
    }

}
