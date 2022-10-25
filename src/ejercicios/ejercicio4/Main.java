package ejercicios.ejercicio4;

public class Main {
    public static void main(String[] args) {
        SmartDevice dispositivo = new SmartDevice("android", true, 10.0);
        System.out.println(dispositivo);

        SmartPhone xiaomiK20 = new SmartPhone("K20", true, 20.5, 6.5);
        System.out.println(xiaomiK20);

        SmartWatch appleWatch = new SmartWatch("apple", true, 3.5, 4.0);
        System.out.println(appleWatch);
    }
}
