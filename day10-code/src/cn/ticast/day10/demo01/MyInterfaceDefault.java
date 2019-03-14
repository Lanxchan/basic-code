package cn.ticast.day10.demo01;
/*
接口的  默认方法
格式:
public default 返回值类型 方法名称(参数列表){
    方法体
    }
备注:
接口中的默认方法,可以解决接口升级的问题

 */
public interface MyInterfaceDefault {
    //抽象方法,原来已有,对应DefaultA,B
    public abstract void methodAbs();

    //新添加了一个抽象方法
//    public abstract void methodAbs2();

    //已经实现的类,DefaultA,B不想修改之,而要在此添加新方法,
    //则改成默认方法
    public default void methodDefault(){//public是灰色的,表示可以省略不写
        System.out.println("这是新添加的默认方法");

    }
}

