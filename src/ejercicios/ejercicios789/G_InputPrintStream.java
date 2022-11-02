package ejercicios.ejercicios789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class G_InputPrintStream {
    public static void main(String[] args) {
        copiaArchivo("prueba.txt", "copiaPrueba.txt");
    }
    public static void copiaArchivo(String fileIn, String fileOut){
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();
            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            in.close();
        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
