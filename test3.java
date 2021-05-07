package Hello;

import java.lang.String;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //int a = 0;
        //define a 数组
        //int Arr[]=new int[3];

        //String ch[] = {"b","2","c","f","a"};

        //int arr[] = {1,2,3,4,5,6,7,8,9};
        //int i = 0;
        String arr1[] = {"语文","数学","英语","物理"};
        int arr3[][] = {{87,78,68,98},{75,85,86,95},{98,98,75,65},{85,75,95,65}};
        for(String i:arr1)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        for (int x[]:arr3)
        {
            for (int y:x)
            {
                System.out.print( y + "  ");
            }
            System.out.print("\n");
        }

        //System.out.println(arr[1]);

        int a = 0;
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();
        System.out.println("请输入：");





    }
}
