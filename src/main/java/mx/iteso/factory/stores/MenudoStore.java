package mx.iteso.factory.stores;

import mx.iteso.factory.Condimentos.Coll;
import mx.iteso.factory.Condimentos.Oregano;
import mx.iteso.factory.Condimentos.Rabanos;
import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Menudo;

public class MenudoStore extends PozoleStore {

    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole = new Menudo();

        pozole = new Oregano(pozole);
        pozole = new Coll(pozole);
        pozole = new Rabanos(pozole);
        return pozole;
    }
}
