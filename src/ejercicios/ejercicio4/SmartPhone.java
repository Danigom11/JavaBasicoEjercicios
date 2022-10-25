package ejercicios.ejercicio4;

public class SmartPhone extends SmartDevice{

    double screenSize;

    public SmartPhone() {}

    public SmartPhone(String modelo, Boolean cargador, double pixelsCamara, double screenSize) {
        super(modelo, cargador, pixelsCamara);
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "screenSize=" + screenSize +
                ", modelo='" + modelo + '\'' +
                ", cargador=" + cargador +
                ", pixelsCamara=" + pixelsCamara +
                '}';
    }
}
