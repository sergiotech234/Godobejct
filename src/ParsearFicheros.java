import java.util.ArrayList;

public class ParsearFicheros {
    public static ArrayList<Estudiante> parsear(ArrayList<String> lineas) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        for(String line : lineas) {
            String[] partes = line.split(";");
            String nombre = partes[0];
            Double nota = Double.parseDouble(partes[1].replace(",", "."));
            estudiantes.add(new Estudiante(nombre,nota));
        }
        return estudiantes;
    }
}
