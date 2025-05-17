import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

public class GestionTemario {
    public static void main(String[] args) {
        // Lista concurrente de temas
        List<Tema> temas = new CopyOnWriteArrayList<>();

        temas.add(new Tema("Cálculo Diferencial", 2));
        temas.add(new Tema("Expresión escrita y comprensión lectora", 1));
        temas.add(new Tema("Taller de ética", 3));

        // Ordenar por título
        Collections.sort(temas);
        System.out.println("Temas ordenados alfabéticamente:");
        temas.forEach(System.out::println);

        // Ordenar por prioridad de manera ascendente
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("\nTemas ordenados por prioridad:");
        temas.forEach(System.out::println);

        // Repositorio concurrente de materiales
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();

        recursos.put("Expresión escrita y comprensión lectora", "https://mensalus.es/blog/infanto-juvevil/2014/01/expresion-escrita-y-comprension-lectora-dos-capacidades-basicas-para-la-gestion-del-conocimiento/");
        recursos.put("Cálculo Diferencial", "https://repositorio-uapa.cuaed.unam.mx/repositorio/moodle/pluginfile.php/2763/mod_resource/content/1/UAPA-Calculo-Diferencial/index.html");
        recursos.put("Taller de ética", "https://rinacional.tecnm.mx/bitstream/TecNM/3798/1/MANUAL%20DE%20TALLER%20DE%20ETICA%20-%20SAB%C3%81TICO%20%282%29.pdf");

        // Mostrar recursos
        System.out.println("\nRepositorio de recursos:");
        recursos.forEach((tema, enlace) -> System.out.println(tema + " → " + enlace));
    }
}