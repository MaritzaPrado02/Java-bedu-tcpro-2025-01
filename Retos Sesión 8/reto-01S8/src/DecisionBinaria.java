public class DecisionBinaria implements LogicaDecision {
    @Override
    public String decidir(String opcionUsuario) {
        return opcionUsuario.equalsIgnoreCase("A") ? "Escena del héroe" : "Escena del villano";
    }
}