import java.util.Objects;

public class Factura {
    //Atributos privados
    private String folio;
    private String cliente;
    private double total;

    //Constructor
    public Factura (String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // toString() para ver fácilmente la información de la factura
    @Override
    public String toString() {
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    // Sobrescribimos equals() para comparar contenido (folio)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Factura factura = (Factura) obj;
        return Objects.equals(folio, factura.folio);
    }

    // hashCode() compatible con equals() basado en folio
    @Override
    public int hashCode() {
        return Objects.hash(folio);
    }
}
