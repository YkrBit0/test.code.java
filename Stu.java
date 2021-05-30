package class_01;

public class Stu {
    //定义成员变量
    String name;
    //私有属性
   private int age = 20;



   //构造方法----无返回值---无返回值类型
   //无参构造
   public Stu()
   {

       return;
   }
   //有参构造
   public Stu(String name,int age)
   {
       this.name = name;
       this.age = age;

   }


    //设置age的值
   public void setAge(int age)
   {
       this.age = age;
   }
   //获取age的值
   public int getAge()
   {
       return age;
   }


   public void show()
   {
       int age = 10;
       System.out.println(age);
       System.out.println(this.age);
   }


    //方法
    public void study()
    {
        System.out.println(name+"正在学习");
    }


    public void showAge(Stu s)
    {
        System.out.println("学生"+s.name+"正在学习,年龄为:"+s.age);
    }



}
