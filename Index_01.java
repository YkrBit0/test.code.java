package Class_API;


//object类---顶级类
/*
成员方法：
    int hashCode----返回对象的哈希码值.
    Class<?> getClass()-----返回该调用者的字节码文件对象
    String toString()--------返回该对象的字符串表示形式,默认打印地址值
    boolean equals()----------比较两个对象是否相等
*/
public class Index_01 {
    public static void main(String[] args) {
        //非静态方法的调用方法
        //1创建object类对象
        Object obj = new Object();
        Object obj1 = new Object();

        Object obj2 = new Object();
        int k = obj2.hashCode();
        //字节码文件
        Class c = obj2.getClass();

        String s = obj2.toString();

        System.out.println(c);
        System.out.println(k);
        System.out.println(s);

        System.out.println("-------------------");
        //测试object类的成员方法
        //int hashCode----返回对象的哈希码值.
        int code1 = obj.hashCode();
        int code2 = obj1.hashCode();
        System.out.println(code1);
        System.out.println(code2);

        System.out.println("-------------------");

        //Class<?> getClass()-----返回该调用者的字节码文件对象
        Class class1 = obj.getClass();
        Class class2 = obj1.getClass();
        System.out.println(class1);
        System.out.println(class2);

        //String toString()--------返回该对象的字符串表示形式.默认打印地址值
        //            地址的组成---全类名+@+对象的无符号的哈希码值的十六进制形式

        String s1 = obj.toString();
        String s2 = obj1.toString();
        System.out.println(s1);
        System.out.println(s2);

        //boolean equals()----------比较两个对象是否相等---默认比较的地址值，无意义
        boolean b1 = obj.equals(obj1);
        System.out.println(b1);


    }
}

/*
class Person extends Object{

}

class Student extends Person{

}
 */
