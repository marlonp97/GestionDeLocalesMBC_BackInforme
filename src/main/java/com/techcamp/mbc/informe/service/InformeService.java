package com.techcamp.mbc.informe.service;

import com.techcamp.mbc.informe.model.Informe;

import java.util.List;

/**
 * Interfaz del servicio para el manejo de los informes
 * @author Marlon Pérez Ríos
 */
public interface InformeService {

    /**
     * Método para devolver todos los registros de la tabla del informe
     * @return Lista de registros del informe
     */
    List<Informe> getAllInforme() throws Exception;

    /**
     * Método para general el informe
     */
    void generarInforme() throws Exception;

}