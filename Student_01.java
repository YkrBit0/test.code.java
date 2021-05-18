package Class_API;

import java.util.Objects;

public class Student_01 {
    //成员变量
    private String name;
    private int id;
    private int age;
    //构造方法
    public Student_01() {
    }

    public Student_01(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //成员方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Student_01{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';

    }

    //重写equals()方法
    /*
    public boolean equals(Object obj)
    {
        //转型
        Student_01 s1 = (Student_01) obj;
        return this.id == s1.id;
    }

     */

    //自动生成
    //通过快捷生成
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student_01 that = (Student_01) o;
        return id == that.id && age == that.age && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age);
    }
}
