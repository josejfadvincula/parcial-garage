package garage;

public class Auto extends Vehiculo {

    public Auto(String patente, String marca, String modelo, int horasEstimadas) {
        super(patente, marca, modelo, horasEstimadas);
    }

    public double calcularCosto() {
        return getHorasEstimadas() * 1000;
    }

    public int obtenerEspacios() {
        return 2;
    }

    public void mostrarDatos() {
        System.out.println("Auto con patente: " + getPatente());
    }
}