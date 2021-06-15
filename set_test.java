package Set_集合;

import java.util.HashSet;
import java.util.Set;

public class set_test {
    public static void main(String[] args) {

        //在set集合中添加元素

        //创建set集合
        Set<cn_student> set = new HashSet<>();

        cn_student s1 = new cn_student("千欧",25);
        cn_student s2 = new cn_student("虚竹",22);
        cn_student s3 = new cn_student("段誉",21);
        cn_student s4 = new cn_student("虚竹",22);
        cn_student s5 = new cn_student("韩信",23);

        //集合中添加元素

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);

        //遍历集合
        /*
            为什么set集合没有去“重”
                set集合保证元素的唯一性依赖, equals()和hasCode()方法
                没有在cn_student类中重写这两个方法，默认调用的是Object类中的这两个方法
                而Object类中的equals()方法默认比较的是地址值是否相同

            解决方法
                在cn_student中重写这两种方法

         */
        System.out.println(set);



    }




}
