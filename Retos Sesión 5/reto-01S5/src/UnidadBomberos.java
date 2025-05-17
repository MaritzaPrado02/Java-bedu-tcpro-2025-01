class UnidadBomberos extends UnidadEmergencia {
    private SistemaGPS gps = new SistemaGPS();
    private Sirena sirena = new Sirena();
    private Operador operador = new Operador("Maritza");

    public UnidadBomberos() {
        super("UnidadBomberos");
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
        System.out.println("🔥 Unidad de bomberos respondiendo a incendio estructural.");
    }
}
