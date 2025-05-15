import java.util.Scanner;

public record Entrada (String nombreEvento, float precioEntrada) {

    public static Entrada recolectarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del evento: ");
        String nombreEvento = scanner.nextLine();

        System.out.print("Precio de la entrada: ");
        float precioEntrada = scanner.nextFloat();

        return new Entrada(nombreEvento, precioEntrada);
    }

    public void mostrarInformacion() {
        System.out.println("\n--- INFORMACIÓN DEL EVENTO ---");
        System.out.println("Evento: " + nombreEvento + " | Precio: " + precioEntrada);
    }

}