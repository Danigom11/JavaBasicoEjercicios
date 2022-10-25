package ejercicios.ejercicio4;

public class SmartWatch extends SmartDevice{

    double diametroPantalla;

    public SmartWatch() {
    }

    public SmartWatch(String modelo, Boolean cargador, double pixelsCamara, double diametroPantalla) {
        super(modelo, cargador, pixelsCamara);
        this.diametroPantalla = diametroPantalla;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "diametroPantalla=" + diametroPantalla +
                ", modelo='" + modelo + '\'' +
                ", cargador=" + cargador +
                ", pixelsCamara=" + pixelsCamara +
                '}';
    }
}
