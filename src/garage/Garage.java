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

    public void reportes() {

        int motos = 0;
        int autos = 0;
        int camiones = 0;

        double recaudacion = 0;

        for (Vehiculo v : vehiculos) {

            recaudacion = recaudacion + v.calcularCosto();

            if (v.obtenerEspacios() == 1) {
                motos++;
            }

            if (v.obtenerEspacios() == 2) {
                autos++;
            }

            if (v.obtenerEspacios() == 4) {
                camiones++;
            }
        }

        System.out.println("=== REPORTES ===");

        System.out.println("Cantidad total de vehículos: " + vehiculos.size());

        System.out.println("Cantidad de motos: " + motos);
        System.out.println("Cantidad de autos: " + autos);
        System.out.println("Cantidad de camiones: " + camiones);

        System.out.println("Espacio ocupado: " + espacioOcupado());
        System.out.println("Espacio libre: " + (capacidadMaxima - espacioOcupado()));

        System.out.println("Recaudación estimada: $" + recaudacion);
    }

    public void mostrarEstado() {

        System.out.println("Capacidad total: " + capacidadMaxima);
        System.out.println("Espacio ocupado: " + espacioOcupado());
        System.out.println("Espacio libre: " + (capacidadMaxima - espacioOcupado()));
    }
}