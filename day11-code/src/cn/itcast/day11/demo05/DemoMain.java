package cn.itcast.day11.demo05;
/*
匿名内部类
接口的实现类或者父类的子类,只用一次
那么可以使用[匿名内部类]


 */
public class DemoMain {
    public static void main(String[] args) {
        MyInterface impl=new MyInterfaceImpl();
        impl.method();

        //匿名内部类使用一次
        MyInterface obj=new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类重写方法");
            }
        };
        obj.method();

    }
}
