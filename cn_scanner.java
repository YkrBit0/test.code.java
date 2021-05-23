package Class_API;

import java.util.Scanner;

public class cn_scanner {
    public static void main(String[] args) {
        //创建Scanner类型的对象
        //Scanner----扫描器
        Scanner num = new Scanner(System.in);

        System.out.println("请输入：");
        //int n = num.nextInt();

        /*
        if(num.hasNext())
        {
            int n = num.nextInt();
            System.out.println(n);

        }
         */

        //System.out.println(n);
        //判断条件
        /*
        if (num.hasNextInt())
        {
            int n = num.nextInt();//接受整数
            System.out.println("num:"+n);
        }
         */
        System.out.println("请输入一个字符：");

        //接收字符串
        //String sc = num.nextLine();
        //System.out.println("num:"+sc);

        String str = num.next();
        System.out.println(str);

    }

}
