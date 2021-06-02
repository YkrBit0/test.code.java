package Class_API;

public class cn_string_01 {
    public static void main(String[] args) {
        String s = "sdgdhbs";
        int n = s.length();
        System.out.println(n);


        //char charAt(1)  获取指定索引位置的字符
        //字符第一次出现的位置
        char c = s.charAt(5);
        System.out.println(c);



        //int indexOf(String)  获取指定字符(串)第一次出现的索引
        int index1 = s.indexOf("g");
        int index2 = s.indexOf(10);
        System.out.println(index1);
        System.out.println(index2);



        //int lastIndexOf(String) 获取指定字符串最后一次出现的位置
        int last = s.lastIndexOf("s");
        System.out.println(last);

        //String substring(int) 获取指定索引位置(包含)之后的所有字符串

        String sub = s.substring(3);
        System.out.println(sub);

        //获取自定义位置段的字符
        String sub1 = s.substring(2,5);
        System.out.println(sub1);








    }
}
