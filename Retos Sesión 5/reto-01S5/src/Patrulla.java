class Patrulla extends UnidadEmergencia{
    private SistemaGPS gps = new SistemaGPS();
    private Sirena sirena = new Sirena();
    private Operador operador = new Operador("Evelyn");

    public Patrulla() {
        super("Patrulla");
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder() {
        System.out.println("🚓 Patrulla atendiendo situación de seguridad ciudadana.");
    }
}
