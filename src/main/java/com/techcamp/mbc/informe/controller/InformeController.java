package com.techcamp.mbc.informe.controller;

import com.techcamp.mbc.informe.model.Informe;
import com.techcamp.mbc.informe.service.InformeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controlador para la generación de informes de pagos
 * @author Marlon Pérez Ríos
 */
@CrossOrigin({"*"})
@RestController
@RequestMapping("/api/v1/informe")
public class InformeController {

    @Autowired
    private InformeService informeService;

    public InformeController(InformeService informeService) {

        this.informeService = informeService;

    }

    /**
     * Método para devolver todos los registros de la tabla del informe
     * @return Respuesta HTTP con la lista de registros del informe
     */
    @GetMapping("/")
    public ResponseEntity<List<Informe>> getAllInforme() throws Exception {

        try {

            // HTTP 200 en caso de que todo esté correcto
            return new ResponseEntity<>(informeService.getAllInforme(), HttpStatus.OK);

        } catch (Exception e) {

            // HTTP 400 en caso de que haya algún error
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }

    }

    /**
     * Método para general el informe
     * @return Respuesta HTTP de la generación del informe
     */
    @GetMapping("/generar/")
    public ResponseEntity<?> generarInforme(){

        try {

            informeService.generarInforme();

            // HTTP 200 en caso de que todo esté correcto
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception e) {

            // HTTP 400 en caso de que haya algún error
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }

    }

}