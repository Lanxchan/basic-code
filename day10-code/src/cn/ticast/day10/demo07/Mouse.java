package cn.ticast.day10.demo07;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("连接鼠标成功");
    }

    @Override
    public void close() {
        System.out.println("与鼠标连接关闭");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
