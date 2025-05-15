import java.util.Scanner;

public class CajeroAutomatico {
    private double saldo;

    public CajeroAutomatico(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("¿Que acción desea realizar?: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    depositar(deposito);
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    retirar(retiro);
                    break;
                case 4:
                    System.out.println("👋 Gracias por usar el cajero. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("❌ Opción inválida. Intenta de nuevo.");
            }

        } while (opcion != 4);
    }

    private void consultarSaldo() {
        System.out.println("💰 Saldo actual: $" + saldo);
    }

    private void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("⚠️ El monto debe ser mayor a 0.");
            return;
        }
        saldo += monto;
        System.out.println("✅ Depósito exitoso. Nuevo saldo: $" + saldo);
    }

    private void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("⚠️ El monto debe ser mayor a 0.");
            return;
        }
        if (monto > saldo) {
            System.out.println("❌ Saldo insuficiente.");
            return;
        }
        saldo -= monto;
        System.out.println("✅ Retiro exitoso. Nuevo saldo: $" + saldo);
    }
}
