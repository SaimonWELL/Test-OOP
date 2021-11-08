package com.company;

public class Coniferous extends Trees {
    private int needle = 1;

    public Coniferous(){}
    public Coniferous(int height , String name , int age , int needle){
        super(height, name, age);
        this.needle=needle;
    }

    public int getNeedle() {
        return needle;
    }

    public void setNeedle(int needle) {
        this.needle = needle;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Размер иголки:\t" + needle);
    }
}
