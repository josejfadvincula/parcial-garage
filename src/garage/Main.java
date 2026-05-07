package garage;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage(10);

        try {

            Vehiculo v1 = new Auto("ABC123", "Ford", "Focus", 3);
            Vehiculo v2 = new Moto("XYZ999", "Honda", "Wave", 2);

            garage.ingresarVehiculo(v1);
            garage.ingresarVehiculo(v2);

            System.out.println("\n=== VEHICULOS ===");
            garage.listarVehiculos();

            System.out.println("\n=== RETIRO ===");
            garage.retirarVehiculo("ABC123");

            System.out.println("\n=== ESTADO ===");
            garage.mostrarEstado();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

    }

}