package Set_集合;

import java.util.*;
import java.util.zip.CRC32;

public class game {
    public static void main(String[] args) {
        //买牌---双列集合---键---值
        Map<Integer,String> pokers = new HashMap<>();

        //定义一个单列集合，用来储存所有牌的编号

        List<Integer> list = new ArrayList<>();

        //具体买牌

        //pokers.put(0,"♥");

        String[] colors = {"♠","♥","♣","♦"};

        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        int num = 0;
        //造普通牌

        for (String number : numbers) {

            for (String  color: colors) {
                String poker = color + number;
                //System.out.println(poker);

                //牌的编号，具体牌放入双列集合中
                pokers.put(num,poker);
                //将牌的编号放入单列集合中
                list.add(num);
                num++;


            }

        }

        //大小王

        pokers.put(num,"小王");
        list.add(num++);

        pokers.put(num,"大王");
        list.add(num);

        System.out.println("所有牌："+pokers);

        System.out.println("牌的序号："+list);

        //洗牌
        Collections.shuffle(list);

        System.out.println(list);

        //Collections.shuffle(pokers);


        //发牌

        //定义4个集合，表示3个玩家，底牌

        List<Integer> lin = new ArrayList<>();
        List<Integer> zali = new ArrayList<>();
        List<Integer> xaih = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();

        //具体发牌，将索引和3取模，决定发给谁

        for (int i = 0; i < list.size(); i++) {

            Integer pokenum = list.get(i);
            //System.out.println(pokenum);

            if(i>=list.size()-3)
            {
                dipai.add(pokenum);
            }else if(i % 3 == 0)
            {
                lin.add(pokenum);
            }else if (i % 3 == 1)
            {
                zali.add(pokenum);

            }else if(i % 3 == 2)
            {
                xaih.add(pokenum);
            }
        }

        //看牌
        System.out.println("lin:"+lin);
        System.out.println("zali:"+zali);
        System.out.println("xaih:"+xaih);
        System.out.println("dipai:"+dipai);

        System.out.println("------------------");
        String str = printpoker(lin,pokers);
        System.out.println("lin:"+str);
        System.out.println("lin:"+printpoker(zali,pokers));
        System.out.println("zali:"+printpoker(xaih,pokers));
        System.out.println("dipai:"+printpoker(dipai,pokers));
    }


    public static String printpoker(List<Integer> nums,Map<Integer,String> pokers) {
        //排列集合---升序
        Collections.sort(nums);

        StringBuilder sb = new StringBuilder();
        //遍历集合，获取每一个编号
        for (Integer num : nums) {
            //StringBuilder sb = new StringBuilder();
            String poker = pokers.get(num);
            sb.append(poker + " ");
        }
        String str = sb.toString();


        return str.trim();  //trim()--去掉首尾空格
    }


}
