import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar datos para la primera factura
        System.out.println("Ingrese la descripción de la primera factura:");
        String desc1 = scanner.nextLine();

        System.out.println("Ingrese el monto de la primera factura:");
        double monto1 = scanner.nextDouble();
        scanner.nextLine(); // Consumir salto de línea

        System.out.println("Ingrese el RFC de la primera factura (o deje en blanco):");
        String rfc1 = scanner.nextLine();
        if (rfc1.isBlank()) rfc1 = null;

        Factura factura1 = new Factura(monto1, desc1, rfc1);

        //Ingresar datos para la segunda factura
        System.out.println("\nIngrese la descripción de la segunda factura:");
        String desc2 = scanner.nextLine();

        System.out.println("Ingrese el monto de la segunda factura:");
        double monto2 = scanner.nextDouble();
        scanner.nextLine(); // Consumir salto de línea

        System.out.println("Ingrese el RFC de la segunda factura (o deje en blanco):");
        String rfc2 = scanner.nextLine();
        if (rfc2.isBlank()) rfc2 = null;

        Factura factura2 = new Factura(monto2, desc2, rfc2);

        // Imprimir los resúmenes
        System.out.println("\n" + factura1.getResumen());
        System.out.println("\n" + factura2.getResumen());

        scanner.close();
    }
}
