import java.util.Scanner;

public class SimuladorFarmacia {
    public String nombreMedicamento;
    public double precioUnitario;
    public int cantidadPiezas;

    // Constructor
    public SimuladorFarmacia(String nombreMedicamento, double precioUnitario, int cantidadPiezas) {
        this.nombreMedicamento = nombreMedicamento;
        this.precioUnitario = precioUnitario;
        this.cantidadPiezas = cantidadPiezas;
    }

    // Método para recolectar datos
    public static SimuladorFarmacia recolectarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Medicamento: ");
        String nombreMedicamento = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad de unidades: ");
        int cantidadPiezas = scanner.nextInt();

        return new SimuladorFarmacia(nombreMedicamento, precioUnitario, cantidadPiezas);
    }


    public void mostrarTicket(){
        System.out.println("======================================");
        System.out.println("              TICKET                  ");
        System.out.println("======================================");
        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Cantidad: " + cantidadPiezas);
        System.out.printf("Precio unitario: $%.2f\n", precioUnitario);

        double totalSinDescuento = precioUnitario * cantidadPiezas;
        System.out.printf("Total sin descuento: $%.2f\n", totalSinDescuento);

        boolean aplicaDescuento = totalSinDescuento >= 500;
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);

        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0.0;
        System.out.printf("Descuento: $%.2f\n", descuento);

        double totalConDescuento = totalSinDescuento - descuento;
        System.out.printf("Total a pagar: $%.2f\n", totalConDescuento);

        System.out.println("======================================");

    }

}
