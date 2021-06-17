package damo;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        try {
            System.out.println("除法运算");
            Scanner cn = new Scanner(System.in);
            System.out.println("请输入a的值：");
            int a = cn.nextInt();
            System.out.println("请输入b的值：");
            int b = cn.nextInt();
            int c = a / b;

            System.out.println(c);
        }catch (Exception e)
        {
            System.out.println("异常是："+e);
        }

    }



}
