package class_01;

public class Class_01 {
    public static void main(String[] args) {
        /*
        //创建对象
        phone p = new phone();
        p.brand = "苹果";
        p.model = "x";
        p.name = "成";
        //调用成员变量
        System.out.println(p.brand);
        System.out.println(p.model);
        System.out.println(p.name);
        System.out.println("--------------------------------");
        //调用类中的方法
        p.call(p.name);
        p.game();
        p.sendmassage();
         */


        Stu a = new Stu();

        //a.name = "小李";
        //a.age = 21;
        //a.study();
        Stu s = new Stu();
        //s.name = "Akil";
        //s.age = 23;
        //s.showAge(s);

        //a.setAge(23);
        //System.out.println(a.getAge() );

        //a.show();

        //设置年龄
        a.setAge(22);
        //获取年龄
        //System.out.println(a.getAge());

        Stu stu = new Stu();
        stu.name = "Alik";
        stu.setAge(22);

        System.out.println(stu.getAge());
        System.out.println(stu.name);

        System.out.println("------------");

        Stu stu2 = new Stu("kil",23);
        System.out.println(stu2.name);
        System.out.println(stu2.getAge());

    }

}


