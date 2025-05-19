import java.util.HashSet;
import java.util.Scanner;

public class MonitorCPU {
    public static void main(String[] args) {
        HashSet<Integer> registros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("Ingrese el consumo de CPU (0-100) o -1 para salir: ");
                String entrada = scanner.nextLine();

                // Validación de número
                try {
                    int consumo = Integer.parseInt(entrada);

                    if (consumo == -1) {
                        break; // Salir del bucle
                    }

                    if (consumo < 0 || consumo > 100) {
                        System.out.println("❌ Error: El valor debe estar entre 0 y 100.");
                        continue;
                    }

                    if (!registros.add(consumo)) {
                        System.out.println("❌ Error: Registro duplicado.");
                        continue;
                    }

                    if (consumo > 95) {
                        throw new ConsumoCriticoException("⚠️ Consumo crítico detectado: " + consumo + "%.");
                    }

                    System.out.println("✅ Registro exitoso: " + consumo + "%.");

                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: Ingresa un número válido.");
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                }
            }
        } finally {
            scanner.close();
            System.out.println("🔚 Finalizando monitoreo de CPU.");
        }
    }
}
