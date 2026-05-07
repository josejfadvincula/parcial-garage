package garage;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage(10);

        try {

            Vehiculo v1 = new Auto("ABC123", "Ford", "Focus", 3);
            Vehiculo v2 = new Moto("XYZ999", "Honda", "Wave", 2);
            Vehiculo v3 = new Camion("TRK111", "Iveco", "Cursor", 5);

            garage.ingresarVehiculo(v1);
            garage.ingresarVehiculo(v2);
            garage.ingresarVehiculo(v3);

            garage.reportes();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

    }

}