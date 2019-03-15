package cn.itcast.day11.demo06;
/*
类作为成员变量

 */
public class Hero {
    private String name;
    private Weapon weapon;
    private int age;

    public void attack(){
        System.out.println("年龄"+age+"的"+name+"用"+weapon.getCode()+"攻击");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public Hero() {
    }
}
