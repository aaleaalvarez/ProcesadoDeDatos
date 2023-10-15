package org.example;

import lombok.Data;

/**
 * Clase que representa un Cliente con sus atributos.
 *
 * @version: 15/10/2023
 * @author: Jose Miguel Ruiz Guevara, Alejandro Álvarez Mérida
 */
@Data
public class Cliente {

    /**
     * Código del cliente.
     */
    private String codigoCliente;

    /**
     * Nombre de la empresa.
     */
    private String nombreEmpresa;

    /**
     * Localidad del cliente.
     */
    private String localidad;

    /**
     * Correo electrónico del cliente.
     */
    private String correoElectronico;

    /**
     * Nombre del responsable del cliente.
     */
    private String nombreResponsable;

    public Cliente(String number, String empresa1, String ciudad1, String mail, String responsable1) {
    }

    public Cliente() {

    }
}