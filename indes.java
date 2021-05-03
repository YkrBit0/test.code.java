package dame;

public class indes {
    public static void main(String[] args) {
        Number.print();
        /*
        int i = 0;
        int j = 0;
        int data[][] = {{1,2,3,4,5},{1,2,3,4,5,2},{4,5,8,9},{1,2,3,5},{1,5,6,7,2,5,4}};
        int sz = data.length;
        for(int x[]:data)
        {
            for(int y:x)
            {
                System.out.print(""+y+" ");
            }
        }
        System.out.println(" ");
        listc_class:for (i = 0; i < 4; i++)
        {
            for(j = 0;j<11;j++)
            {
                System.out.println("真在查找"+i+"班级"+j+"学生");
                if(i==2&&j==5)
                {
                    System.out.println("哈哈找到了");
                    break listc_class;    //终止指定的循环
                }
            }
            System.out.println("  ");
        }
         */
    }
}


class Number
{
    public static void print()
    {
        int i = 0;
        int j = 0;
        for(i = 1;i<=9;i++)
        {
            for (j = 1;j<=i;j++)
            {
                System.out.printf("%d * %d = %2d  ",j,i,i*j);
            }
            System.out.println(" ");
        }
    }

}
