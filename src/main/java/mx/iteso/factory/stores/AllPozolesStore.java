package mx.iteso.factory.stores;


import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;


public class AllPozolesStore {




    public Pozole orderPozole(String meat, String type) {

        Pozole pozole = null;

        if(type.equals("Rojo")){
            PozoleStore rojoStore = new PozoleRojoStore();
            pozole = rojoStore.orderPozole(meat);
        }
        else if(type.equals("Verde")){
            PozoleStore verdeStore = new PozoleVerdeStore();
            pozole = verdeStore.orderPozole(meat);
        }
        else if(type.equals("Blanco")){
            PozoleStore blancoStore = new PozoleBlancoStore();
            pozole = blancoStore.orderPozole(meat);
        }
        else if(type.equals("Pozolillo")){
            PozoleStore pozolilloStore = new PozolilloStore();
            pozole = pozolilloStore.orderPozole(meat);
        }
        else if(type.equals("Menudo")){
            PozoleStore menudoStore = new MenudoStore();
            pozole = menudoStore.orderPozole(meat);
        }

        return pozole;
    }


}
