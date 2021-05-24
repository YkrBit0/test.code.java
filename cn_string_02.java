package Class_API;

public class cn_string_02 {
    public static void main(String[] args) {
        String sl = "abc";
        int i = 0;
        //byte[]  getBytes();    将字符串转成字节数组
        byte[] bys = sl.getBytes();    //97  98 99
        for(i = 0;i<bys.length;i++)
        {
            System.out.println(bys[i]);

        }

        System.out.println("-------------------");

        //char[] toCharArray();    将字符串转成字符数组
        char[] chs = sl.toCharArray();   // a b c
        for(i = 0;i<chs.length;i++)
        {
            System.out.println(chs[i]);
        }

        System.out.println("-------------------");

        //static  String  valueof(..);     将指定类型数据转换成字符串
        //整形123  --->  字符串“123”
        String s = String.valueOf(123);
        System.out.println(s + 4);
        //在实际的开发中上面的形式用下面的方式代替
        String s1 = "" + 123;
        System.out.println(s1 + 4);

        //String replace(old,new)   将指定字符串替换成新的字符串

    }
}
