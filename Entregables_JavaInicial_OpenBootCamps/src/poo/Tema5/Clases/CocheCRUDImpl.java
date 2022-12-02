package poo.Tema5.Clases;

import poo.Tema5.Interfaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {


    @Override
    public void save() {
        System.out.println("Se grabo el dato");

    }

    @Override
    public void findAll() {
        System.out.println("Estos son los datos");

    }

    @Override
    public void delete() {
        System.out.println("Se eliminó el dato");

    }
}
