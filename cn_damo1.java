package List_集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
    Collections
        ---针对集合操作的工具

    方法
        max(Collection<T>)   返回集合的最大值
        sort(List<T>)        将指定列表升序排序
        reverse(List<T>)     返回List集合元素
        shuffle(<T>)         使用默认的随机源随机置换指定的列表



 */
public class cn_damo1 {
    public static void main(String[] args) {


        //创建集合
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(0);
        list.add(2);


        System.out.println("没有造作前，集合的数据"+list);

        System.out.println("----------");

        //获取集合中的最大元素
        Integer max = Collections.max(list);

        System.out.println("集合中的最大元素："+max);

        System.out.println("----------");

        //对集合进行升序
        Collections.sort(list);

        System.out.println("升序后"+list);

        System.out.println("----------");
        //反转集合中的元素
        Collections.reverse(list);

        System.out.println("反转后"+list);


        System.out.println("----------");
        //随机置换，相当与洗牌

        Collections.shuffle(list);
        System.out.println("随机置换后"+list);

    }
}
