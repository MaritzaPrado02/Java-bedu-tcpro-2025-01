import java.io.*;
import java.nio.file.*;

public class GestorDeErrores {
    private static final Path ARCHIVO_FALLOS = Paths.get("C:/Users/marit/Documents/logs/registro_fallos.txt");

    public static void registrarFallo(String mensaje) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_FALLOS.toString(), true))) {
            bw.write("Error al analizar el archivo: " + mensaje);
            bw.newLine();
            bw.flush(); // 💡 Forzamos la escritura antes de cerrar
        } catch (IOException e) {
            System.out.println("No se pudo registrar el fallo: " + e.getMessage());
        }
    }
}
