package ejercicios.ejercicios789;

import java.util.ArrayList;

public class E_ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            listaEnteros.add(i);
        }
        listaEnteros.removeIf(n -> (n % 2 == 0));
        for (Integer listaEntero : listaEnteros) {
            System.out.println(listaEntero);
        }
    }
}
