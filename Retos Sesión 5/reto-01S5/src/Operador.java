class Operador {
    //Atributos
    private String nombre;

    //Constructor
    public Operador(String nombre) {
        this.nombre = nombre;
    }

    //Método clase operador
    public void reportarse() {
        System.out.println("👷 Operador " + nombre + " reportándose.");
    }
}
