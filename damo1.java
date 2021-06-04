package Class_封装;

public class damo1 {
    public static void main(String[] args) {

        //注意：Character类中没有parseXXX()方法
        //字符串想转换成char类型的数据，可以通过:String类中的方法tocharArray(),charAt()

        //int 基本类型
        int a = 10;
        //基本类型转----装箱
        Integer a1 = new Integer(20);
        //拆箱
        int b = a1.intValue();
        System.out.println(b);
        System.out.println(a1);

        //JDK5特性---自动拆装箱
        Integer i = 20;
        int c = i;
        System.out.println("-------------------");


        //类型转换esgf
        String s = "10";
        int num = Integer.parseInt(s);
        System.out.println(num);

        //字符串想转换成char类型的数据，可以通过:String类中的方法tocharArray(),charAt()
        String s3 = "asdfa";
        char d = s3.charAt(3);
        char[] k = s3.toCharArray();
        System.out.println(d);
        System.out.println(k[2]);


    }
}
