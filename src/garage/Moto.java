package garage;

public class Moto extends Vehiculo {

    public Moto(String patente, String marca, String modelo, int horasEstimadas) {
        super(patente, marca, modelo, horasEstimadas);
    }

    public double calcularCosto() {
        return getHorasEstimadas() * 700;
    }

    public int obtenerEspacios() {
        return 1;
    }

    public void mostrarDatos() {
        System.out.println("Moto con patente: " + getPatente());
    }
}