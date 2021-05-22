package final_01;

public class Person_01 {
   private String name;
   private int age;
   private String sex;

    public Person_01() {
    }

    public Person_01(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //子类不能被修改
    final void porperly()
    {
        System.out.println("灵长");
    }

}
