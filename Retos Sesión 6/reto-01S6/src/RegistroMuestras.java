import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {
        // Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> listaMuestras = new ArrayList<>();
        listaMuestras.add("Mus musculus");
        listaMuestras.add("Pichia pastoris");
        listaMuestras.add("Bacillus subtilis");
        listaMuestras.add("Mus musculus");

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(listaMuestras);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> idInvestigador = new HashMap<>();
        idInvestigador.put("M-001", "Dra. Quezada");
        idInvestigador.put("M-002", "Dr. Del Toro");
        idInvestigador.put("M-003", "Mtra. Prado");

        // Paso 4: Mostrar resultados con número de llegada
        System.out.println("Lista completa de muestras en orden de llegada:");
        for (int i = 0; i < listaMuestras.size(); i++) {
            System.out.println((i+1) + ". " + listaMuestras.get(i));
        }

        System.out.println("\nEspecies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("\nRelación de ID de muestra → investigador:");
        for (Map.Entry<String, String> entrada : idInvestigador.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        // Búsqueda por ID de muestra
        String idBuscado = "M-001";
        System.out.println("\nInvestigador responsable de la muestra " + idBuscado + ": " + idInvestigador.get(idBuscado));
    }
}
