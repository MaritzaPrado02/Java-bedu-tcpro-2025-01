import java.util.Scanner;

public class ScannerPaciente {

    public Paciente recolectarDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del paciente: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Número de expediente: ");
        String expendiente = scanner.nextLine();

        return new Paciente(nombre, edad, expendiente);
    }
}

