package Class_API;

public class Test {
    public static void main(String[] args) {
        Student_01 s = new Student_01("kilf",1,23);
        //测试toString方法
        System.out.println(s);
        System.out.println(s.toString());

        //测试equals()方法

        Student_01 s1 = new Student_01("kilf",12,22);

        boolean b1 = s.equals(s1);
        System.out.println(b1);

        Object obj = new Object();
        Class t = obj.getClass();
        System.out.println(t);









    }
}
