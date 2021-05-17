package Class_API;

public class cn_string {
    public static void main(String[] args) {
        //指定字节数组转换字符串

       byte[] byt = {97,98,99};
       String s1 = new String(byt);
       System.out.println(s1);

       //字符数组转换成字符串
        char[] chs = {'h','e','l','l','o'};
        String c = new String(chs);
        System.out.println(c);

        //String s1 = 'asfd'  省去了new
        //String s1 = new String('asfd')
        System.out.println("--------------------");

        //测试成员方法
        String str1 = "abc";
        String str2 = "ABC";
        //判断字符串是否相同---区分大小写
        boolean b1 = str1.equals(str2);
        System.out.println(b1);

        //判断字符串是否相同---不区分大小写
        boolean b2 = str1.equalsIgnoreCase(str2);
        System.out.println(b2);

        //判断字符串以什么开头

        boolean b3 = str1.startsWith("a");
        System.out.println(b3);

        //判断字符串是否为空
        String str3 = " ";
        boolean n = str3.isBlank();
        System.out.println(n);


    }
}
