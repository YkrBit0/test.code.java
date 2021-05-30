package class_01;

public class phone {
    //成员变量定义在类中，方法外的变量
    //品牌
    String brand;
    //类型
    String model;
    //名称
    String name;
    //定义打电话的方法
    public void call(String name)
    {
        System.out.println("给"+name+"打电话话");
    }
    //定义发短信的方法
    public void sendmassage()
    {
        System.out.println("发短信");
    }
    //定义玩游戏的方法
    public void game()
    {
        System.out.println("玩游戏");
    }
}
