package mx.iteso.factory.stores;

import mx.iteso.factory.Condimentos.Cebolla;
import mx.iteso.factory.Condimentos.Lechuga;
import mx.iteso.factory.Condimentos.Rabanos;
import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

public class PozoleVerdeStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole;
        if (meat.equals("pollo"))
            pozole = new PozoleVerdePollo();
        else if (meat.equals("cachete") )
            pozole = new PozoleVerdeCachete();
        else if (meat.equals("oreja"))
            pozole = new PozoleVerdeOreja();
        else if (meat.equals("pierna") )
            pozole = new PozoleVerdePierna();
        else if (meat.equals("trompa"))
            pozole = new PozoleVerdeTrompa();
        else return null;

        pozole = new Cebolla(pozole);
        pozole = new Rabanos(pozole);
        pozole = new Lechuga(pozole);


        return pozole;
    }
}
