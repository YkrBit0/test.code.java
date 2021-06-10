package List_集合;

import java.util.ArrayList;
import java.util.List;

//创建集合对象
//创建元素对象
//将元素对象添加到集合对象中
//遍历集合

public class list_01 {
    public static void main(String[] args) {
        //在集合中加三个学生类
        List list = new ArrayList();
        student s = new student("乔峰",21);
        student s1 = new student("虚竹",23);
        student s2 = new student("段誉",22);
        student s3 = new student("likj",22);

        student n = new student();
        n.setName("dsfgs");


        //将元素添加到集合对象中
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        /*
        boolean b1 = list.add(s);
        System.out.println(b1);
         */
        //直接打印集合
        System.out.println(list);

        //获取索引为2的元素
        Object obj = list.get(2);
        System.out.println(obj);

        //获取集合中的元素个数
        System.out.println("集合的长度为："+list.size());


        //遍历集合
        for (int i = 0;i<list.size();i++)
        {
            //获取元素
            Object obk = list.get(i);

            System.out.println(obk);
        }
    }
}
