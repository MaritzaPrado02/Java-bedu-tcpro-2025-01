public abstract class UnidadEmergencia {
    //Atributos
    protected String nombre;

    //Constructor
    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }


    public void activarUnidad() {
        System.out.println("🚨 Activando unidad: " + nombre);
    }

    public abstract void responder();
}
