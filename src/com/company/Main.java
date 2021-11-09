package com.company;
import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {
        ArrayList<Plants> list = new ArrayList();

        Plants plant = new Plants(50, "Игорь");
        Trees tree = new Trees(150 , "Дуб" , 80);
        Coniferous coniferou = new Coniferous(500 , "Кедр" , 190 , 5);
        Deciduous deciduou = new Deciduous(452 , "Берёза" , 150 , 10);

        list.add(plant);
        list.add(tree);
        list.add(coniferou);
        list.add(deciduou);

        for (int i = 0; i< list.size(); i++){
            list.get(i).print();
            System.out.println();

        }











    }

}
