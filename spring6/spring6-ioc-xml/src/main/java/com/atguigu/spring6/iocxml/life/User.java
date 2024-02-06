package com.atguigu.spring6.iocxml.life;

public class User {
    //无参构造
    public User(){
        System.out.println("1 调用无参数构造，创建bean对象");
    }
    //初始化方法
    public void initMethod(){
        System.out.println("4 调用指定的初始化的方法");
    }

    //销毁方法
    public void  destroyMethod(){
        System.out.println("7 bean对象的销毁，调用指定的销毁的方法");
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2 bean对象设置属性值");
        this.name = name;
    }
}
