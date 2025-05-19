public class MainNarrativa {
    private final TransicionHistoria transicionHistoria;
    private final GestorDialogo gestorDialogo;
    private final LogicaDecision logicaDecision;

    public MainNarrativa(TransicionHistoria transicionHistoria, GestorDialogo gestorDialogo, LogicaDecision logicaDecision) {
        this.transicionHistoria = transicionHistoria;
        this.gestorDialogo = gestorDialogo;
        this.logicaDecision = logicaDecision;
    }

    public void jugar(String opcionUsuario) {
        String nuevaEscena = logicaDecision.decidir(opcionUsuario);
        transicionHistoria.cambiarEscena(nuevaEscena);
        gestorDialogo.mostrarDialogo("La historia avanza...");
    }

    public static void main(String[] args) {
        MainNarrativa juego = new MainNarrativa(new TransicionSimple(), new DialogoTexto(), new DecisionBinaria());
        juego.jugar("A");
    }
}
