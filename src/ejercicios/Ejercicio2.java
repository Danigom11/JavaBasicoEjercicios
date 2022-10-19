package ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {

        double precio = 100.00;
        System.out.println("Precio sin IVA: " + precio);
        double resultado = getPriceIva(precio);
        System.out.println("Precio con IVA: " + resultado + "€");
    }

    static double getPriceIva(double precio) {
        return precio * 1.21;
    }


}
