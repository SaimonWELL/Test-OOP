package com.company;

public class Deciduous extends Trees {
    private int leaf = 1;

    public Deciduous(){}
    public Deciduous(int height , String name , int age , int leaf){
        super(height, name, age);
        this.leaf=leaf;
    }

    public int getLeaf() {
        return leaf;
    }

    public void setLeaf(int leaf) {
        this.leaf = leaf;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Размер листа:\t" + leaf);
    }
}
