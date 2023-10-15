import org.example.ManejadorArchivos;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ManejadorArchivosTest {

    @Test
    public void testLeerPlantilla() {
        try {
            String contenido = ManejadorArchivos.leerPlantilla("src/test/resources/test_template.txt");
            assertEquals("Contenido de la plantilla de prueba", contenido.trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCrearArchivo() {
        try {
            String ruta = "src/test/resources/test_output.txt";
            String contenido = "Contenido de prueba";
            ManejadorArchivos.crearArchivo(ruta, contenido);
            String contenidoLeido = ManejadorArchivos.leerPlantilla(ruta);
            assertEquals(contenido, contenidoLeido.trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLimpiarCarpetaSalida() {
        try {
            String rutaCarpetaSalida = "src/test/resources/test_salida";
            String rutaArchivo1 = rutaCarpetaSalida + "/archivo1.txt";
            String rutaArchivo2 = rutaCarpetaSalida + "/archivo2.txt";

            ManejadorArchivos.crearArchivo(rutaArchivo1, "Contenido de prueba 1");
            ManejadorArchivos.crearArchivo(rutaArchivo2, "Contenido de prueba 2");

            ManejadorArchivos.limpiarCarpetaSalida(rutaCarpetaSalida);

            File carpeta = new File(rutaCarpetaSalida);
            assertEquals(0, carpeta.listFiles().length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}