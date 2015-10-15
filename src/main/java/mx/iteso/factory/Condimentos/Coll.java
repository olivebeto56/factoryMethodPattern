package mx.iteso.factory.Condimentos;


import mx.iteso.factory.CondimentsDecorator;
import mx.iteso.factory.Pozole;

public class Coll extends CondimentsDecorator {


    public Coll(Pozole pozole){
        this.toppings = pozole.toppings;
        this.name = pozole.name;
        this.broth = pozole.broth;
        toppingAdd();
    }

    @Override
    public void toppingAdd() {
        toppings.add("Col");
    }


}
