package cn.ticast.day10.demo07;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("连接键盘成功");
    }

    @Override
    public void close() {
        System.out.println("与键盘连接关闭");
    }

    public void type(){
        System.out.println("键盘键入");
    }
}
