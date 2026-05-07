package garage;

import java.util.ArrayList;

public class Garage {

    private int capacidadMaxima;
    private ArrayList<Vehiculo> vehiculos;

    public Garage(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        vehiculos = new ArrayList<Vehiculo>();
    }

    public int espacioOcupado() {

        int total = 0;

        for (Vehiculo v : vehiculos) {
            total = total + v.obtenerEspacios();
        }

        return total;
    }

    public void ingresarVehiculo(Vehiculo v)
            throws GarageLlenoException,
            PatenteDuplicadaException,
            HorasInvalidasException {

        if (v.getHorasEstimadas() <= 0) {
            throw new HorasInvalidasException("Las horas deben ser mayores a 0");
        }

        for (Vehiculo x : vehiculos) {

            if (x.getPatente().equals(v.getPatente())) {
                throw new PatenteDuplicadaException("La patente ya existe");
            }
        }

        if (espacioOcupado() + v.obtenerEspacios() > capacidadMaxima) {
            throw new GarageLlenoException("No hay espacio disponible");
        }

        vehiculos.add(v);

        System.out.println("Vehículo ingresado correctamente");
    }

    public void listarVehiculos() {

        for (Vehiculo v : vehiculos) {
            v.mostrarDatos();
        }
    }

    public void retirarVehiculo(String patente)
            throws VehiculoNoEncontradoException {

        Vehiculo encontrado = null;

        for (Vehiculo v : vehiculos) {

            if (v.getPatente().equals(patente)) {
                encontrado = v;
            }
        }

        if (encontrado == null) {
            throw new VehiculoNoEncontradoException("Vehículo no encontrado");
        }

        vehiculos.remove(encontrado);

        System.out.println("Vehículo retirado correctamente");
        encontrado.mostrarDatos();
        System.out.println("Costo total: $" + encontrado.calcularCosto());
    }

    public void mostrarEstado() {

        System.out.println("Capacidad total: " + capacidadMaxima);
        System.out.println("Espacio ocupado: " + espacioOcupado());
        System.out.println("Espacio libre: " + (capacidadMaxima - espacioOcupado()));
    }
}