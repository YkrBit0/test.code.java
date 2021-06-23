package List_集合;

import java.util.ArrayList;
import java.util.List;

public class cn_for {
    /*
    增强for模式
        for(元素数据类型  变量名：要遍历的数组或集合)
    增强for就是迭代器的简写形式


     */

    public static void main(String[] args) {
        //创建集合对象

        //创建元素对象

        //将元素对象添加到集合对象中

        //遍历集合

        List list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //增强for循环
        for (Object obj :list)
        {
            //向下转型
            Integer i = (Integer)obj;

            System.out.println(obj);

            System.out.println(i);
        }

        System.out.println("-------------------------");
        //快捷键-----iter
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("---------------------");

        //创建集合对象
        List list1 = new ArrayList();

        //创建元素对象

        int it[] = {1,2,3,4,5,3};

        String st[] = {"a","b","c","d"};

        for (int i:it)
        {
            list1.add(i);
        }

        for (String s:st)
        {
            list1.add(s);
        }

        for (Object oj:list1)
        {
            System.out.println(oj);
        }


    }

}
