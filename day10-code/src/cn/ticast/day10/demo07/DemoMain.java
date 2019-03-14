package cn.ticast.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        //首先创建一个电脑
        Computer comp=new Computer();
        comp.powerOn();

        //准备一个鼠标
        Mouse mou=new Mouse();
        //向上转型
        USB usbMouse=mou;//使用多态写法

        comp.useDevice(usbMouse);

        //创建键盘
        Keyboard keyboard=new Keyboard();//没有使用多态写法
        //参数是USB类型,传参进去的是USB的实现类keyboard
        comp.useDevice(keyboard);//也正确,自动向上转型
        comp.useDevice(new Keyboard());

        comp.powerOff();
    }
}
