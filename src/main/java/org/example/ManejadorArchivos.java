package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Clase que proporciona métodos para manejar archivos.
 *
 * @version: 15/10/2023
 * @author: Jose Miguel Ruiz Guevara, Alejandro Álvarez Mérida
 */
public class ManejadorArchivos {

    /**
     * Lee el contenido de un archivo y lo devuelve como una cadena de caracteres.
     *
     * @param ruta Ruta del archivo a leer.
     * @return Contenido del archivo como una cadena de caracteres.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    public static String leerPlantilla(String ruta) throws IOException {
        return new String(Files.readAllBytes(Paths.get(ruta)));
    }

    /**
     * Crea un nuevo archivo con el contenido especificado.
     *
     * @param ruta Ruta donde se creará el archivo.
     * @param contenido Contenido del archivo.
     * @throws IOException Si ocurre un error al crear el archivo.
     */
    public static void crearArchivo(String ruta, String contenido) throws IOException {
        Files.write(Paths.get(ruta), contenido.getBytes());
    }

    /**
     * Limpia una carpeta eliminando todos los archivos que contiene.
     *
     * @param rutaCarpetaSalida Ruta de la carpeta a limpiar.
     * @throws IOException Si ocurre un error al limpiar la carpeta.
     */
    public static void limpiarCarpetaSalida(String rutaCarpetaSalida) throws IOException {
        File carpetaSalida = new File(rutaCarpetaSalida);

        // Crear la carpeta si no existe
        if (!carpetaSalida.exists()) {
            carpetaSalida.mkdirs();
        }

        for (File archivo : carpetaSalida.listFiles()) {
            if (archivo.isFile()) {
                archivo.delete();
            }
        }
    }
}