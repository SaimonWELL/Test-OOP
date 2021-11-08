package com.company;

public class Trees extends Plants {
     private int age = 1;

     public Trees(){}
     public Trees (int height , String name , int age){
         super(height,name);
         this.age=age;
     }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Возраст:\t" + getAge());

    }
}
