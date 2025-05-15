//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ScannerPaciente lector = new ScannerPaciente();
        Paciente paciente = lector.recolectarDatos();

        System.out.println("\n--- Datos del paciente ---");
        paciente.mostrarInformacion();
    }
}
