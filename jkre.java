package Hello;

/*
import java.util.Scanner;

public class jk{
    public static void main(String[] args){
        System.out.println("请输入学院人数：");
            Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        System.out.println("请输入每年的学费：");
            Scanner feels = new Scanner(System.in);
        int feel = feels.nextInt();

        int u = num*feel;

        System.out.println("该学院总学费为：");
        //System.out.print("number\n");
        System.out.println(u);
    }
}
*/
public class jkre {
    public static void main(String[] args) {
        //创建数组
        String arr1[] = {"语文","数学","英语","物理"};
        int arr3[][] = {{87,78,68,98},{75,85,86,95},{98,98,75,65},{85,75,95,65}};
        for(String i:arr1)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        //使用foreach方法遍历数组元素
        for (int x[]:arr3)
        {
            for (int y:x)
            {
                System.out.print( y + "  ");
            }
            System.out.print("\n");
        }

    }
}
