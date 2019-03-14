package cn.itcast.day09.demo06;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.call();
        p.send();
        p.show();

        System.out.println();

        NewPhone np=new NewPhone();
        np.call();
        np.send();
        np.show();
    }
}
