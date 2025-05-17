public class CentralEmergencias {
    public static void main(String[] args) {
        UnidadEmergencia ambulancia = new Ambulancia();
        UnidadEmergencia patrulla = new Patrulla();
        UnidadEmergencia bomberos = new UnidadBomberos();

        System.out.println();
        ((Ambulancia) ambulancia).iniciarOperacion();
        System.out.println();
        ((Patrulla) patrulla).iniciarOperacion();
        System.out.println();
        ((UnidadBomberos) bomberos).iniciarOperacion();
    }
}
