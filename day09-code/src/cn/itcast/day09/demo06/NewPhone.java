package cn.itcast.day09.demo06;
//定义一个新手机,老手机的子类
public class NewPhone extends Phone {

    //直接写上show出现提示,回车自动补全
    @Override
    public void show() {
        super.show();//把父类的show方法拿过来重复利用,自己子类再增加新的内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
