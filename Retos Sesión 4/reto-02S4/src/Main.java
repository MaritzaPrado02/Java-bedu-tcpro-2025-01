public class Main {
    public static void main(String[] args) {
        // Declaración
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("PAMA850624KJ4", 18600.0);

        // Cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("PAMA850624KJ4", 23500.0);

        // Imprimir la información
        System.out.println("🧾 Declaración de Impuestos:");
        System.out.println("RFC: " + declaracion.rfcContribuyente());
        System.out.println("Monto Declarado: $" + declaracion.montoDeclarado());

        System.out.println("\n🏦 Cuenta Fiscal:");
        System.out.println("RFC: " + cuenta.getRfc());
        System.out.println("Saldo Disponible: $" + cuenta.getSaldoDisponible());

        // Validación RFC
        if (cuenta.validarRFC(declaracion)) {
            System.out.println("\n✅ El RFC coincide entre la cuenta y la declaración.");
        } else {
            System.out.println("\n❌ El RFC NO coincide entre la cuenta y la declaración.");
        }
    }
}
