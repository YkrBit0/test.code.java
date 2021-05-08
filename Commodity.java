package test;

public class Commodity{
    //定义成员变量
    private String name;
    private int price;
    private long number;
    //构造类型
    public Commodity() {

    }
    public Commodity(String name, int price,int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }
    //定义产品说明方法
    public void state()
    {
        System.out.println("本产品名:"+this.name+"产品价格为:"+this.price+"产品编码为："+this.number);
    }

    //设置name和price和number
    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    //获取name和price和number
    public int getPrice() {
        return price;
    }

    public long getNumber() {
        return number;
    }

    public String getName() {
        return name;

    }

}
