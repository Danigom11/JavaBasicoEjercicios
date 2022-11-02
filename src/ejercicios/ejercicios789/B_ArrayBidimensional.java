package ejercicios.ejercicios789;

public class B_ArrayBidimensional {
    public static void main(String[] args) {
        int cadena[][] = {
                {1, 2},
                {10, 20, 30, 40, 50}
        };
        for (int i = 0; i < cadena.length; i++) {
            System.out.println("Columna: " + i);
            for (int j = 0; j < cadena[i].length; j++) {
                System.out.println("Columna: " + i + " fila: " + j);
                System.out.println("El valor almacenado es: " + cadena[i][j]);
            }
        }
    }
}
