package cn.itcast.day09.demo10;

public class Zi extends Fu {
    int num=20;

    @Override
    public void method(){
        super.method();
        System.out.println("子类方法");
    }

    /**
     * 展示
     * @param a 参数a
     * @param b 参数b
     */
    public void show(int a,int b){
        int num=30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
