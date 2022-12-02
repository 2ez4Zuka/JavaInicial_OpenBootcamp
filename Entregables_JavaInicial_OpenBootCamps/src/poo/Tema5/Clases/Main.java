package poo.Tema5.Clases;

public class Main {
    public static void main(String[] args) {


        CocheCRUDImpl cocheCrud  = new CocheCRUDImpl();
        cocheCrud.save();
        cocheCrud.delete();
        cocheCrud.findAll();

    }
}
