package cn.itcast.day11.demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("aa");

        //使用单独定义的实现类
        hero.setSkill(new SkillImpl());
        hero.attack();

        //使用匿名内部类
        Skill skill=new Skill() {
            @Override
            public void use() {
                System.out.println("匿名内部类:使用技能");
            }
        };
        hero.setSkill(skill);
        hero.attack();

        //同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("匿名内部类+匿名对象:使用技能");
            }
        });
        hero.attack();
    }
}
