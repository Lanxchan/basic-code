package cn.itcast.day11.demo06;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("aaa");
        hero.setAge(20);

        //创建武器对象
        Weapon weapon=new Weapon("bbb");
        hero.setWeapon(weapon);
        hero.attack();

    }
}
