package map_集合;

/*
    Map集合特点
        双列集合，元素由键值构成
        key(键)---value(值)
        key不可重复 value可重复
   应用
        Map<T1,T2> map = new HashMap<>()
        T1---键的数据类型
        T2---值的数据类型
   方法
        V put(K key, V value) 添加元素
                              元素第一此添加返回null
                              重复添加 会用新值覆盖旧值，并返回旧值


        V get(Object key)   根据键获取对应的值

        Set<K>keySet()    获取所有键的集合

    遍历集合
        1 获取所有键的集合   keySet()
        2 遍历所有的键，获取每一个键   迭代器  for
        3 根据键，获取指定的值  get()


 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class cn_map {
    public static void main(String[] args) {
        //创建集合对象
        Map<Integer,Student1> map = new HashMap<>();

        //创建元素对象
        Student1 s1 = new Student1("小明",21);
        Student1 s2 = new Student1("小王",22);
        Student1 s3 = new Student1("小李",23);

        //元素对象添加到集合对象中

        //System.out.println(map);

        //集合中添加元素
        /*
        Student1 stu1 = map.put(1,s1);

        System.out.println(stu1);

        Student1 stu2 = map.put(1,s2);

        System.out.println(stu2);
         */

        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);

        System.out.println(map);

        System.out.println("-------------");

        //根据键获取值

        Student1 stu = map.get(2);
        System.out.println(stu);


        System.out.println("-------------");

        //遍历集合

        //1 获取所有键的集合   keySet()
        Set<Integer> keys = map.keySet();

        //2 遍历所有的键，获取每一个键   迭代器  for

        Iterator<Integer> it = keys.iterator();

        while (it.hasNext())
        {
            //获取迭代器中的元素
            Integer key = it.next();
            //3 根据键，获取指定的值  get()
            Student1 value = map.get(key);
            System.out.println("key:" + key + "value:" + value);
        }

        System.out.println("-------------");

        //增强for循环
        Set<Integer> keys1 = map.keySet();

        for (Integer integer : keys1) {
            Student1 val = map.get(integer);
            System.out.println(val);

        }

    }
}
