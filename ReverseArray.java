package static_关键字;

public class ReverseArray {
    int num = 10;
    static int num2 = 20;



    //静态方法中没有对象this，所以不能访问非静态成员
    public static void show()
    {
        //System.out.println(num);  报错
        System.out.println(num2);

    }

    //交换数字---反转
    public static void reverse(int[] arr)
    {
       for (int i = 0;i< arr.length/2;i++)
       {
           int item = arr[i];
           arr[i] = arr[arr.length-1-i];
           arr[arr.length-1-i] = item;

       }

    }

}
