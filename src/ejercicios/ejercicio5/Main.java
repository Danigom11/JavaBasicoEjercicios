package ejercicios.ejercicio5;

public class Main {

    static CocheCRUD cocheCrud = new CocheCRUDImpl();
    public static void main(String[] args) {

        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}
