package com.techcamp.mbc.informe.service;

import com.techcamp.mbc.informe.dao.InformeDao;
import com.techcamp.mbc.informe.model.Informe;
import com.techcamp.mbc.informe.repository.InformeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * Servicio para el manejo de los informes
 * @author Marlon Pérez Ríos
 */
@Service
public class InformeServiceImpl implements InformeService {

    @Autowired
    private InformeRepository informeRepository;

    @Autowired
    private InformeDao informeDao;

    public InformeServiceImpl(InformeRepository informeRepository, InformeDao informeDao) {

        this.informeRepository = informeRepository;
        this.informeDao = informeDao;

    }

    /**
     * Método para devolver todos los registros de la tabla del informe
     * @return Lista de registros del informe
     */
    @Override
    public List<Informe> getAllInforme() throws Exception {

        try {

            return informeRepository.findAll();

        } catch (Exception e) {

            throw new Exception();

        }

    }

    /**
     * Método para general el informe
     */
    @Override
    public void generarInforme() throws Exception {

        try {

            // Calcular año anterior al actual
            LocalDate fechaActual = LocalDate.now();
            int anioActual = fechaActual.getYear();
            int anioInforme = anioActual - 1;

            informeDao.llamarProcedimientoInforme(anioInforme);

        } catch (Exception e) {

            throw new Exception();

        }

    }

}