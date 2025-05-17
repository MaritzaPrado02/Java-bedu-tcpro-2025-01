public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[] {
                //Parametros para cada uno de los metodos de pago
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTransferencia(200.0, false)
        };

        for (MetodoPago pago : pagos) {
            if (pago instanceof Autenticable) {
                Autenticable a = (Autenticable) pago;
                if (a.autenticar()) {
                    System.out.println("✅ Autenticación exitosa.");
                    pago.procesarPago();
                    pago.mostrarResumen();
                } else {
                    System.out.println("❌ Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válida.");
                }
                System.out.println();
            }
        }
    }
}
