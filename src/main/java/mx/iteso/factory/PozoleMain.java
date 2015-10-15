package mx.iteso.factory;

import mx.iteso.factory.Condimentos.Cebolla;
import mx.iteso.factory.stores.*;

public class PozoleMain {
    public static void main (String[] args) {
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore menuderia = new MenudoStore();
        AllPozolesStore allStore = new AllPozolesStore();

        Pozole pozole = verdeStore.orderPozole("pollo");

        System.out.println("First order is: "+ pozole.getName());
        System.out.println();


        pozole = rojoStore.orderPozole("pollo");
        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();

        pozole = menuderia.orderPozole("pollo");
        System.out.println("Third order is: "+ pozole.getName());
        System.out.println();


        pozole = allStore.orderPozole("oreja","Verde");
        System.out.println("Quarter order is: "+ pozole.getName());


    }
}