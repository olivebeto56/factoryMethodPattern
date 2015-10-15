package mx.iteso.factory.Condimentos;


import mx.iteso.factory.CondimentsDecorator;
import mx.iteso.factory.Pozole;

public class Cebolla extends CondimentsDecorator {


    public Cebolla(Pozole pozole){
        this.toppings = pozole.toppings;
        this.name = pozole.name;
        this.broth = pozole.broth;
        toppingAdd();
    }

    @Override
    public void toppingAdd() {
        toppings.add("Cebolla");
    }


}
