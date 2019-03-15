package cn.itcast.day11.demo07;
/*
接口作为成员变量

 */
public class Hero {
    private String name;
    private Skill skill;

    public void attack(){
        System.out.println("我叫"+name+"开始释放技能");
        skill.use();//调用接口的抽象方法
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public Hero() {
    }
}
