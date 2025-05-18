import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    private static final Path archivoLog = Paths.get("C:/Users/marit/Documents/logs/errores.log");

    public static void main(String[] args) {
        LectorDeLogs lector = new LectorDeLogs(archivoLog);

        lector.analizar();

        if (lector.huboError()) {
            GestorDeErrores.registrarFallo(lector.getMensajeError());
        } else {
            lector.mostrarResumen();
        }
    }
}
