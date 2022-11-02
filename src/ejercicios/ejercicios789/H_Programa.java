package ejercicios.ejercicios789;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class H_Programa {
    /*
    Adivinar un número del 1 al 5

     */
    public static void main(String[] args) {
        Random numAleatorio = new Random();
        ArrayList<String> respuestaNegativa = new ArrayList<>();
        respuestaNegativa.add("No puedes engañarme. Sé que pensabas en el número que te he dicho");
        respuestaNegativa.add("Vaya! Te has confundido. En realidad querías poner un 1. Lo sé todo. Recuerda que te leo la mente");
        respuestaNegativa.add("Ya, ya, ya... no quieres reconocer que te leo la mente. Vale. Ok. No lo he acertado entonces. Cómo quieras ;-)");
        respuestaNegativa.add("Crees que pensabas otro número pero estás equivocado. ¿Recuerdas que puedo leer tu mente?");
        int numeroRespuestaNegativa = numAleatorio.nextInt(0,respuestaNegativa.size() - 1);

        ArrayList<String> respuestaPositiva = new ArrayList<>();
        respuestaPositiva.add("Te lo dije. Te leo la mente.");
        respuestaPositiva.add("Desconectando de tu cerebro........ Desconectado. Tanto tiempo conectado es agotador...");
        respuestaPositiva.add("Tranquilo, lo único que he mirado en tu cerebro es el número. No he visto casi nada más...");
        respuestaPositiva.add("Puedes intentarlo cuánto quieras. Nunca fallo.");
        int numeroRespuestaPositiva = numAleatorio.nextInt(0, respuestaPositiva.size() - 1);

        System.out.println("................................");
        System.out.println("Conectando con tú cerebro......");
        System.out.println("................................");
        System.out.println("Conectado!");
        System.out.println("Te leo la mente");
        System.out.println("Piensa en un número del 1 al 5 y te diré cual es");
        boolean ok = false;
        int numeroPensado = numAleatorio.nextInt(1,5);
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                ok = true;
                System.out.println("¿Lo tienes? Pulsa 1: ");
                int numero = scanner.nextInt();

                if (numero != 1) {
                    System.out.println("¿Sigues pensando? Cuando lo tengas pon un 1 y dale a enter.");
                } else {
                    System.out.println("Muy bien......");
                    System.out.println("El número es: " + numeroPensado);
                    System.out.println("Pulsa 1 para confirmar lo que ya sabía: ");
                    int confirmacion = scanner.nextInt();
                    if (confirmacion != 1) {
                        System.out.println(respuestaNegativa.get(numeroRespuestaNegativa));
                    } else {
                        System.out.println(respuestaPositiva.get(numeroRespuestaPositiva));
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("Números inválidos");
            }
        } while (!ok);


    }

}
