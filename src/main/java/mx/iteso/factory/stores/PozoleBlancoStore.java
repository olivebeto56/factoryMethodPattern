package mx.iteso.factory.stores;


import mx.iteso.factory.Condimentos.Coll;
import mx.iteso.factory.Condimentos.Oregano;
import mx.iteso.factory.Condimentos.Rabanos;
import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

public class PozoleBlancoStore extends PozoleStore{

    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole;
        if (meat.equals("pollo"))
            pozole = new PozoleBlancoPollo();
        else if (meat.equals("cachete") )
            pozole = new PozoleBlancoCachete();
        else if (meat.equals("oreja"))
            pozole = new PozoleBlancoOreja();
        else if (meat.equals("pierna") )
            pozole = new PozoleBlancoPierna();
        else if (meat.equals("trompa"))
            pozole = new PozoleBlancoTrompa();
        else return null;


        pozole = new Oregano(pozole);
        pozole = new Coll(pozole);
        pozole = new Rabanos(pozole);


        return pozole;

    }

}
