import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("notas.txt");

            ArrayList<String> linea = LeerFichero.leer(path);
            ArrayList<Estudiante> estudiantes = ParsearFicheros.parsear(linea);
            double media = CalcularMedia.calcular(estudiantes);
            MostrarResultados.mostrar(media);
        }catch (Exception e){
            System.out.println("Error al procesar el fichero");
            e.printStackTrace();
        }
    }
}