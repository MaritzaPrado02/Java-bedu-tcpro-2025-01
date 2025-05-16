public class Vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;

    // Constructor
    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    // Método para reservar asiento con un objeto Pasajero
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        }
        return false;
    }

    // Métodopara reservar asiento con nombre y pasaporte
    public boolean reservarAsiento(String nombre, String pasaporte) {
        if (asientoReservado == null) {
            asientoReservado = new Pasajero(nombre, pasaporte);
            return true;
        }
        return false;
    }

    // Cancelar la reserva
    public void cancelarReserva() {
        asientoReservado = null;
    }

    // Obtener información del vuelo
    public String obtenerItinerario() {
        String info = "Vuelo: " + codigoVuelo + "\nDestino: " + destino + "\nHora de salida: " + horaSalida;
        if (asientoReservado != null) {
            info += "\nPasajero: " + asientoReservado.getNombre() + " (Pasaporte: " + asientoReservado.getPasaporte() + ")";
        } else {
            info += "\nAsiento no reservado.";
        }
        return info;
    }
}
