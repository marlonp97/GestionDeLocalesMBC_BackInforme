package com.techcamp.mbc.informe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * Modelo de los informes
 * @author Marlon Pérez Ríos
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "MBC_INFORME")
public class Informe {

    @Id
    @Column(name = "ID_PAGO")
    private Long idPago;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "PRECIO")
    private Float precio;

    @Column(name = "FECHA_VENCIMIENTO")
    private LocalDate fechaVencimiento;

    @Column(name = "SOPORTE")
    private String soporte;

    @Column(name = "VALOR_PAGADO")
    private Float valorPagado;

    @Column(name = "FECHA_PAGO")
    private LocalDate fechaPago;

    @Column(name = "TIPO_PAGO")
    private String tipoPago;

    @Column(name = "LOCAL")
    private String local;

    @Column(name = "EMPRESA")
    private String empresa;

    @Column(name = "USUARIO")
    private String usuario;

}