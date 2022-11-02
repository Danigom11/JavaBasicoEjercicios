package ejercicios.ejercicios789;

public class F_DividePorCero {
    public static void main(String[] args) {
        try {
            System.out.println(dividePorCero(4, 0));
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }
    public static int dividePorCero(int A, int B) throws ArithmeticException {
        try {
            return A / B;
        }  catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }
}
