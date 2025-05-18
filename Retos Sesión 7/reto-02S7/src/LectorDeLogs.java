import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class LectorDeLogs {
    private final Path archivoLog;
    private int totalLineas = 0;
    private int errores = 0;
    private int advertencias = 0;
    private String mensajeError = null;

    public LectorDeLogs(Path archivoLog) {
        this.archivoLog = archivoLog;
    }

    public void analizar() {
        try (BufferedReader br = Files.newBufferedReader(archivoLog)) { // ✅ Usa Files.newBufferedReader
            String linea;

            while ((linea = br.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) errores++;
                if (linea.contains("WARNING")) advertencias++;
            }
        } catch (IOException e) {
            mensajeError = e.getMessage();
        }
        System.out.println("Análisis completado. Mostrando resumen...");
    }

    public void mostrarResumen() {
        double porcentajeErrores = (totalLineas > 0) ? (errores * 100.0 / totalLineas) : 0;
        double porcentajeAdvertencias = (totalLineas > 0) ? (advertencias * 100.0 / totalLineas) : 0;

        System.out.println("Resumen del análisis:");
        System.out.println("Total de líneas leídas: " + totalLineas);
        System.out.println("Cantidad de errores: " + errores);
        System.out.println("Cantidad de advertencias: " + advertencias);
        System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
        System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeAdvertencias);
    }

    public boolean huboError() {
        return mensajeError != null;
    }

    public String getMensajeError() {
        return mensajeError;
    }
}
