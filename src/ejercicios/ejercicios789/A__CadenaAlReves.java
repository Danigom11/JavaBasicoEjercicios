package ejercicios.ejercicios789;

public class A__CadenaAlReves {

    public static void main(String[] args) {
        System.out.println(reverse("hola mundo"));
    }
    public static String reverse(String texto) {
        StringBuilder textoAlReves = new StringBuilder();
        for (int i = texto.length()-1; i >= 0; i--) {
            textoAlReves.append(texto.charAt(i));
        }
        return textoAlReves.toString();
    }
}

