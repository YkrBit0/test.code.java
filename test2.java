package Hello;

import java.util.Scanner;

public class test2 {
    public static void main(String[] ages){
        /*
        System.out.println("请输入num的值");
        Scanner numed = new Scanner(System.in);

        int num = numed.nextInt();
        System.out.println(num);
        */
        int aa = 10;
        byte bb = 20;
        //byte cc = aa+bb;  要将byte类型转换为int类型
        byte dd= (byte)(aa+bb);         //类型转换来计算
        System.out.println(dd);
        System.out.println(aa+bb);

        System.out.println("------------------");

        double d1= 3.14;
        //int a1 = d1;  报错---型精度，数值范围大小

        int a1 = (int)d1;
        System.out.println(a1);



    }

}






















