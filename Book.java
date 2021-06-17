package damo;

import java.util.Iterator;
public class Book {
    private String name;
    private long number;
    private String author;
    private int pice;
    //空参构造
    public Book() {
    }
    //带参构造
    public Book(String name, int number, String author, int pice) {
        this.name = name;
        this.number = number;
        this.author = author;
        this.pice = pice;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPice() {
        return pice;
    }

    public void setPice(int pice) {
        this.pice = pice;
    }

    public static void main(String[] args) {
        Book book = new Book("人生是一场修行",100123,"llgsdg",17);

        System.out.println(book.name);
        System.out.println(book.author);
        System.out.println(book.number);
        System.out.println(book.pice);
    }

}
