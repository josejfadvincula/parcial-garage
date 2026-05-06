public class Camion extends Vehiculo {

    public Camion(String patente, String marca, String modelo, int horasEstimadas) {
        super(patente, marca, modelo, horasEstimadas);
    }

    public double calcularCosto() {
        return 0;
    }

    public int obtenerEspacios() {
        return 0;
    }

    public void mostrarDatos() {
    }
}