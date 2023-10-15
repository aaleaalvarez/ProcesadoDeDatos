package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Clase que proporciona métodos para parsear un archivo CSV y convertirlo en una lista de objetos Cliente.
 *
 * @version: 15/10/2023
 * @author: Jose Miguel Ruiz Guevara, Alejandro Álvarez Mérida
 */
public class CSVParser {

    /**
     * Parsea un archivo CSV y devuelve una lista de objetos Cliente.
     *
     * @param archivoCSV Ruta del archivo CSV a parsear.
     * @return Lista de objetos Cliente.
     */
    public static List<Cliente> parse(String archivoCSV) {
        List<Cliente> clientes = new ArrayList<>();
        Set<String> responsables = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosCliente = linea.split(",");
                if (datosCliente.length < 5) {
                    System.out.print("Faltan datos en la fila: " + linea);
                    System.out.println();
                    continue;
                }
                //Mejora del proyecto: Encuentra duplicados de responsable y no crea su txt
                String responsable = datosCliente[4];
                if (responsables.contains(responsable)) {
                    System.out.println("Duplicado encontrado para el nombre del responsable: " + responsable);
                    continue;
                }
                Cliente cliente = new Cliente();
                cliente.setCodigoCliente(datosCliente[0]);
                cliente.setNombreEmpresa(datosCliente[1]);
                cliente.setLocalidad(datosCliente[2]);
                cliente.setCorreoElectronico(datosCliente[3]);
                cliente.setNombreResponsable(responsable);
                clientes.add(cliente);
                responsables.add(responsable);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return clientes;
    }
}