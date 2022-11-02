package ejercicios.ejercicios789;

import java.util.ArrayList;
import java.util.LinkedList;

public class D_ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");
        lista.add("Elemento D");

        for (String nombre : lista) {
            System.out.println("ArrayList: " + nombre);
        }

        LinkedList<String> listaEnlazada = new LinkedList(lista);

        for (String nombre : listaEnlazada) {
            System.out.println("LinkedList: " + nombre);
        }

    }
}
