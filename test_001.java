package test3;

public class test_001 {

    private void show1()
    {
        System.out.println("show1 private");
    }

    void show2()
    {
        System.out.println("show2 默认");
    }

    protected void show3()
    {
        System.out.println("show3 protected");
    }

    public void show4()
    {
        System.out.println("show4 public");
    }
    /*
    private 主要给自己用
    默认     主要给同包下的来使用
    protected 主要给子类用
    public    主要给大家使用
     */

    public static void main(String[] args) {

        test_001 t = new test_001();
        t.show1();
        t.show2();
        t.show3();
        t.show4();
    }


}
