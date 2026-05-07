package garage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese capacidad máxima del garage: ");
        int capacidad = sc.nextInt();

        Garage garage = new Garage(capacidad);

        int opcion = 0;

        while (opcion != 6) {

            System.out.println("\n=== SISTEMA DE GARAGE ===");
            System.out.println("1. Registrar ingreso");
            System.out.println("2. Registrar salida");
            System.out.println("3. Listar vehículos");
            System.out.println("4. Mostrar estado");
            System.out.println("5. Reportes");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            sc.nextLine();

            try {

                if (opcion == 1) {

                    System.out.println("\n1. Moto");
                    System.out.println("2. Auto");
                    System.out.println("3. Camion");

                    System.out.print("Seleccione tipo de vehículo: ");
                    int tipo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Patente: ");
                    String patente = sc.nextLine();

                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Horas estimadas: ");
                    int horas = sc.nextInt();

                    Vehiculo v = null;

                    if (tipo == 1) {
                        v = new Moto(patente, marca, modelo, horas);
                    }

                    if (tipo == 2) {
                        v = new Auto(patente, marca, modelo, horas);
                    }

                    if (tipo == 3) {
                        v = new Camion(patente, marca, modelo, horas);
                    }

                    garage.ingresarVehiculo(v);
                }

                if (opcion == 2) {

                    System.out.print("Ingrese patente: ");
                    String patente = sc.nextLine();

                    garage.retirarVehiculo(patente);
                }

                if (opcion == 3) {
                    garage.listarVehiculos();
                }

                if (opcion == 4) {
                    garage.mostrarEstado();
                }

                if (opcion == 5) {
                    garage.reportes();
                }

                if (opcion < 1 || opcion > 6) {
                    System.out.println("Opción inválida");
                }

            } catch (Exception e) {

                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();

        System.out.println("Sistema finalizado");
    }

}