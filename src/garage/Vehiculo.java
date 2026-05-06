package garage;

public abstract class Vehiculo implements Calculable, Mostrable {

    private String patente;
    private String marca;
    private String modelo;
    private int horasEstimadas;

    public Vehiculo(String patente, String marca, String modelo, int horasEstimadas) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.horasEstimadas = horasEstimadas;
    }

    public String getPatente() {
        return patente;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public abstract int obtenerEspacios();
}