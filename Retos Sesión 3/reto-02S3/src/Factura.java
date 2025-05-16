import java.util.Optional;

public class Factura {
    // Atributos privados
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    //Constructor
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    //Método público para generar resumen
    public String getResumen() {
        String resumen = "📄 Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";
        resumen += "RFC: " + (rfc.isPresent() && !rfc.get().isBlank() ? rfc.get() : "[No proporcionado]");
        return resumen;
    }
}
