package garage;

public class Camion extends Vehiculo {

    public Camion(String patente, String marca, String modelo, int horasEstimadas) {
        super(patente, marca, modelo, horasEstimadas);
    }

    public double calcularCosto() {
        return getHorasEstimadas() * 1500;
    }

    public int obtenerEspacios() {
        return 4;
    }

    public void mostrarDatos() {
        System.out.println("Camion con patente: " + getPatente());
    }
}