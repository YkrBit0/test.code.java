package damo;

public class Book_01 {
    private String name;
    private long num;
    private String writer;
    private int pc;

    public Book_01() {
    }

    public Book_01(String name, long num, String writer, int pc) {
        this.name = name;
        this.num = num;
        this.writer = writer;
        this.pc = pc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public void show()
    {
        System.out.println(getName());
        System.out.println(getNum());
        System.out.println(getPc());
        System.out.println(getWriter());

    }

    public static void main(String[] args) {
        Book_01 book = new Book_01("语文",1003,"dfyt",10);
        book.show();

    }

}
