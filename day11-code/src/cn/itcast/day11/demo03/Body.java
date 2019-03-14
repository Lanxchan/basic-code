package cn.itcast.day11.demo03;

public class Body {
    //成员内部类
    public class Heart{
        //内部类的方法
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("name="+name);
        }
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("外部类的方法");

        //调用内部类
        Heart heart=new Heart();
        heart.beat();
        new Heart().beat();
    }
}
