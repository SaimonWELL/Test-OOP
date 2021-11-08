package com.company;

public class Plants {
     private String name = "Default";
     private int height = 1 ;

     public Plants() {}
     public Plants(int height, String name) {
         this.name = name;
         this.height = height;
     }
     public Plants(int height){
         this.height = height;
     }
     public Plants(String name){
         this.name = name;
     }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Название:\t" + getName());
        System.out.println("Рост:\t" + getHeight());
    }
}


