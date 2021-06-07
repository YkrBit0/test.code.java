package static_关键字;

public class Developer {
    String name;
    String work;

    public final static String departeamName = "研发部";     // 应该加static
    //static 修饰的变量可以被该类下所有对象所共享

    public void selfintroductuon()
    {
        System.out.println("我是"+departeamName+"的"+name+"我的工作是"+work);
    }


}
