package com.atguigu.spring6.iocxml.di;

public class Book {
    private String bname;
    private String author;

    //无参数构造
    public Book() {
        System.out.println("无参数构造执行了：。。。。。。。。。");

    }

    //有参数构造方法
    public Book(String bname, String author) {
        System.out.println("有参数构造执行了：。。。。。。。");
        this.bname = bname;
        this.author = author;
    }

    //生成set方法

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
    public static void main(String[] args) {
        //set方法注入 --原生写法
        Book book = new Book();
        book.setBname("java");
        book.setAuthor("YUXS");
        //通过构造器注入
        Book book1 = new Book("c++","YUXS");
    }
}
