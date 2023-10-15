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

    public Cliente(String codigoCliente, String nombreEmpresa, String localidad, String correoElectronico, String nombreResponsable) {
        this.codigoCliente = codigoCliente;
        this.nombreEmpresa = nombreEmpresa;
        this.localidad = localidad;
        this.correoElectronico = correoElectronico;
        this.nombreResponsable = nombreResponsable;
    }

    public Cliente() {

    }
}