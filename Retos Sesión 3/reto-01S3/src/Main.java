public class Main {
    public static void main(String[] args) {
        // Crear pasajero y vuelo
        Pasajero pasajero1 = new Pasajero("Patricia Cortes", "J987345");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Reservar asiento
        if (vuelo.reservarAsiento(pasajero1)) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        }

        // Mostrar itinerario
        System.out.println("✈ Itinerario del vuelo:");
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("\n ❎ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // Mostrar itinerario después de cancelar
        System.out.println("✈ Itinerario del vuelo:");
        System.out.println(vuelo.obtenerItinerario());

        // Reservar nuevamente con nombre y pasaporte
        vuelo.reservarAsiento("Maritza Prado", "P897543");

        // Mostrar itinerario final
        System.out.println("\n✈ Itinerario del vuelo:");
        System.out.println(vuelo.obtenerItinerario());
    }
}
