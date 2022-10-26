package ejercicios.ejercicio4;

public class SmartDevice {
    String modelo;
    Boolean cargador;
    double pixelsCamara;

    public SmartDevice() {
    }

    public SmartDevice(String modelo, Boolean cargador, double pixelsCamara) {
        this.modelo = modelo;
        this.cargador = cargador;
        this.pixelsCamara = pixelsCamara;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "modelo='" + modelo + '\'' +
                ", cargador=" + cargador +
                ", pixelsCamara=" + pixelsCamara +
                '}';
    }

}
