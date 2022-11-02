package ejercicios.ejercicios789;

import java.util.Vector;

public class C_Vectores {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.remove(1);
        vector.remove(2);

        for (int i = 0; i < vector.size(); i++) {
            System.out.println("Posición del vector: " + i + ", valor: " + vector.get(i));
        }

        /*
        Si conocemos previamente la capacidad que tendrá el vector es mejor indicarlo en sus valores al crearlo.
        Cada vez que se amplía su capacidad se hace una copia en memoria del anterior vector y se copia al nuevo vector con el nuevo tamaño
        Si se está aumentando continuamente el tamaño del vector se multipica el uso de la memoria innecesariamente
        Por ello, si se conoce el tamaño aproximado del vector, es mejor indicarlo al principio
        */

    }
}
