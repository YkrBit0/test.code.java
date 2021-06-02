package Class_API;

import java.util.Calendar;

import java.util.Date;

public class cn_data_calender {
    public static void main(String[] args) {
        //Data类
        Date data = new Date();
        System.out.println(data);

        //获取毫秒值
        long time = data.getTime();
        System.out.println(time);

        //创建一个指定的时间
        //long类型的数据，后面要加l
        Date data2 = new Date(1622636462123l);
        System.out.println(data2);


        System.out.println("-------------------");

        //Calender类为抽象类不能new
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //获取信息---年月日
        int year = c.get(Calendar.YEAR);
        int march = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);
        System.out.println(year + "年"+(march+2)+"月" + day+"日");


        //设置
        c.set(Calendar.YEAR,2022);
        int year2 = c.get(Calendar.YEAR);
        System.out.println(year2);

        c.set(2020,1,2);
        int year3 = c.get(Calendar.YEAR);
        int march3 = c.get(Calendar.MONTH);
        int day3 = c.get(Calendar.DATE);
        System.out.println(year3 + "年"+march3+"月" + day3+"日");

    }


}

