package List_集合;
/*
    迭代器
        对过程的重复叫做迭代
        迭代器是遍历collection集合的通用方式
    迭代器的常用方法
        E next()    返回迭代的下一个元素
        boolean hasNext()   如果有元素可迭代就返回ture
     迭代器是List体系独有的遍历方式，可在集合遍历的同时，添加，删除，等操作
     但是必须调用列表迭代器的方法来实现。

     使用步骤
        1：根据集合对象获取迭代器对象
        2：判断迭代器中是否有元素
        3：如果有就获取元素


 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cn_collection {

    //迭代器遍历List集合

    public static void main(String[] args) {
        //迭代器遍历List集合

        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //遍历集合

        //1：根据集合对象获取迭代器对象
        /*
        Iterator it = list.iterator();
        // 2：判断迭代器中是否有元素
        while (it.hasNext()){
            //如果迭代器中有元素，就一直迭代
            String s = (String)it.next();
            //  3：如果有就获取元素
            System.out.println(s);

        }
        */

       System.out.println("-------------------");

        //加字符串
        //1：根据集合对象获取迭代器对象
        Iterator it = list.iterator();

        while (it.hasNext())
        {
            String s = (String) it.next();
            if("b".equals(s)) //规避空指针异常
            {
                //如果到这里，说明集合中有b
                //list.add("java"); //报错---并发修改异常

            }
            System.out.println(s);

        }

    }

}
