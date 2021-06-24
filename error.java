package damo;

import java.util.Scanner;

public class error {

    public static void main(String[] args) {
        try {
            System.out.println("除法运算");
            Scanner sn = new Scanner(System.in);
            System.out.println("请输入i的值：");
            int i = sn.nextInt();
            System.out.println("请输入j的值：");
            int j = sn.nextInt();
            int c = i/j;
            System.out.println(c);
        }catch (Exception a){
            System.out.println("异常为："+a);
        }

    }

}
