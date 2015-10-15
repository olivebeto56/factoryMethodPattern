package mx.iteso.factory.stores;

import mx.iteso.factory.Condimentos.*;
import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

public class PozoleRojoStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole;
        if (meat.equals("pollo"))
            pozole = new PozoleRojoPollo();
        else if (meat.equals("cachete") )
            pozole = new PozoleRojoCachete();
        else if (meat.equals("oreja"))
            pozole = new PozoleRojoOreja();
        else if (meat.equals("pierna") )
            pozole = new PozoleRojoPierna();
        else if (meat.equals("trompa"))
            pozole = new PozoleRojoTrompa();
        else return null;


        pozole = new Oregano(pozole);
        pozole = new Coll(pozole);
        pozole = new Rabanos(pozole);


        return pozole;
    }
}
