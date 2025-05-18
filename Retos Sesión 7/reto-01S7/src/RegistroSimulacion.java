import java.nio.file.*;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroSimulacion {

    private static final String DIRECTORIO = "C:/Users/marit/Documents/config";
    private static final String ARCHIVO = DIRECTORIO + "/parametros.txt";

    public static void main(String[] args) {
        guardarParametros();

        if (Files.exists(Paths.get(ARCHIVO))) {
            System.out.println("El archivo ha sido creado exitosamente.");
            leerParametros();
        } else {
            System.out.println("Error: el archivo no se ha creado.");
        }
    }

    public static void guardarParametros() {
        try {
            Path directorio = Paths.get(DIRECTORIO);
            Path archivo = Paths.get(ARCHIVO);

            if (!Files.exists(directorio)) {
                Files.createDirectories(directorio);
            }

            LocalDateTime fechaHoraActual = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            String contenido = """
                    Tiempo de ciclo: 55.8 segundos
                    Velocidad de línea: 1.2 m/s
                    Número de estaciones: 8
                    Otra cosa: Valor adicional
                    Fecha y hora de creación: %s
                    """.formatted(fechaHoraActual.format(formato));

            Files.write(archivo, contenido.getBytes());
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void leerParametros() {
        try {
            String contenido = Files.readString(Paths.get(ARCHIVO));
            System.out.println("Contenido del archivo:\n" + contenido);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
