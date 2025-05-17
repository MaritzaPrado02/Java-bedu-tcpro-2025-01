public abstract class MetodoPago {
    //Atributos
    double monto;

    //Constructor
    public MetodoPago(double monto){
        this.monto = monto;
    }

    //Método abstracto
    public abstract void procesarPago();

    //Método concreto
    public void mostrarResumen(){
        System.out.println("📄 Tipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }
}
