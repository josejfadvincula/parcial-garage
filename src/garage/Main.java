package garage;

public class Main {

    public static void main(String[] args) {

        Vehiculo v = new Auto("ABC123", "Ford", "Fiesta", 2);

        System.out.println("Costo total:");
        System.out.println(v.calcularCosto());

    }

}