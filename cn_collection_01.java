package List_集合;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class cn_collection_01 {
    public static void main(String[] args) {
        //迭代器遍历List集合

        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        //根据集合对象获取--列表迭代器--对象
        ListIterator lit = list.listIterator();

        //判断迭代器中是否有元素
        while (lit.hasNext())
        {
            //有就获取元素
            String s = (String) lit.next();
            if ("b".equals(s))
            {
                //list.add("java")   会报错
                lit.add("java");    //用列表迭代器来增加元素

            }
            System.out.println(s);
        }

        System.out.println("--------------");
        System.out.println(list);

    }

}
