package com.atguigu.spring6;


import org.junit.jupiter.api.Test;

public class User {
    //无参数构造
    public User(){
        System.out.println("0:无参数构造执行了");
    }
    public void add(){
        System.out.println("add......");
    }
    public  static void main(String[] args){
        User user =new User();
        user.add();
    }
    //反射创建对象
    @Test
    public  void testUserObject() throws Exception{
        //获取类class对象
        Class<?> clazz = Class.forName("com.atguigu.spring6.User");
        //调用方法创建对象
        //Object o =clazz.newInstance();
        User user = (User)clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
