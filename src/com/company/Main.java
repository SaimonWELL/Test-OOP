package com.company;

public class Main {

    public static void main(String[] args) {

        Plants plant = new Plants(50, "Игорь");
        Trees tree = new Trees(150 , "Дуб" , 80);
        Coniferous coniferou = new Coniferous(500 , "Кедр" , 190 , 5);
        Deciduous deciduou = new Deciduous(452 , "Берёза" , 150 , 10);


        plant.print();
        System.out.println();
        tree.print();
        System.out.println();
        coniferou.print();
        System.out.println();
        deciduou.print();



    }

}
