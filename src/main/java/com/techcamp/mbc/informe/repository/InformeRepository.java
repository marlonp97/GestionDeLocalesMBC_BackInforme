package com.techcamp.mbc.informe.repository;

import com.techcamp.mbc.informe.model.Informe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio JPA de los informes
 * @author Marlon Pérez Ríos
 */
@Repository
public interface InformeRepository extends JpaRepository<Informe, Long> {
}