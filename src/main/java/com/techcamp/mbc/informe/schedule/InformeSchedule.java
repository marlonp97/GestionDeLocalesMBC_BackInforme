package com.techcamp.mbc.informe.schedule;

import com.techcamp.mbc.informe.service.InformeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Scheduler para la generación de informes de pagos de manera automática
 * @author Marlon Pérez Ríos
 */
@Component
public class InformeSchedule {

    @Autowired
    private InformeService informeService;

    public InformeSchedule(InformeService informeService) {

        this.informeService = informeService;

    }

    /**
     * Método para ejecutar el servicio de generación del informe los días 5 de enero de cada año a las 00:00
     */
    @Scheduled(cron= "0 0 0 5 1 *")
    public void cronJobSch() {

        try {

            informeService.generarInforme();

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}