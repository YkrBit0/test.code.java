package dame;

import java.util.Random;
import java.util.Scanner;

public class send_game {
    public static void main(String[] args) {
        test();


        /*
        int count = 0;
        int i = 0;
        int j = 0;
        for(i = 0;i<7;i++)
        {
            for(j = 0;j<13;j++)
            {
                if(j%5==0)
                {
                   continue;
                }
                System.out.println("正在给第"+i+"班级的第"+j+"同学发");
                count++;
                if(count >= 100)
                {
                    break;
                }

            }
        }
        System.out.println("发放结束");
        System.out.println("发放数"+count);

        int k = 0;
        int i = 0;
        Random num = new Random();
        int number = num.nextInt(10);
        Scanner input = new Scanner(System.in);
        while (k<7)
        {
            System.out.println("请输入");
            int re = input.nextInt();
            if(number>re)
            {
                System.out.println("你猜小了");
            }
            else if (number<re)
            {
                System.out.println("你猜大了");
            }
            else {
                System.out.println("你猜对了");
                break;
            }
            k++;
        }

         */


    }

    public static void menu()
    {
        System.out.println("************************************");
        System.out.println("********** 1:play   0:exit  ********");
        System.out.println("************************************");
    }

    public static void game()
    {
        int k = 0;
        int i = 0;
        Random num = new Random();
        int number = num.nextInt(10);
        Scanner input = new Scanner(System.in);
        System.out.println("开始游戏");
        while (true)
        {
            System.out.println("请输入你要猜的数字");
            int re = input.nextInt();
            if (number > re) {
                System.out.println("你猜小了");
            } else if (number < re) {
                System.out.println("你猜大了");
            } else {
                System.out.println("你猜对了");
                break;
            }
        }


    }

    public static void test()
    {
        Scanner input = new Scanner(System.in);
        do {
            menu();
            System.out.println("请输入");
            int num = input.nextInt();
            int flag = 1;
            switch (num)
            {
                case 1:
                    game();
                    break;
                case 0:
                    System.out.println("退出游戏");
                    flag = 0;
                    break;
                default:
                    System.out.println("输入错误");
                    break;

            }
            if (flag == 0)
                break;

        }while (true);
        
    }


}
