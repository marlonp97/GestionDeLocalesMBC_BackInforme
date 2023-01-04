package com.techcamp.mbc.informe.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

/**
 * DAO para la conexión con JDBC a procedimiento de Oracle
 * @author Marlon Pérez Ríos
 */
@Component
public class InformeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public InformeDao(JdbcTemplate jdbcTemplate) {

        this.jdbcTemplate = jdbcTemplate;

    }

    /**
     * Método para llamar procedimiento de Oracle a través de JDBC
     * @param anioInforme Año del que se quiere generar el informe
     */
    public void llamarProcedimientoInforme(int anioInforme) {

        // Llamar el procedimiento
        SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
                .withSchemaName("APP_GEST_LOCALES")
                .withCatalogName("PKG_INFORME_PAGOS")
                .withProcedureName("GENERAR_INFORME_PAGOS");

        // Añadir la entrada del prodecimiento
        SqlParameterSource in = new MapSqlParameterSource()
                .addValue("año_informe", anioInforme);

        // Ejecutar el procedimiento
        simpleJdbcCall.execute(in);

    }

}