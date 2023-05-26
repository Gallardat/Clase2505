package com.softtek.hibernate.repositorio;

import com.softtek.hibernate.modelo.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ITemporadaRepo extends JpaRepository<Temporada, Long> {

    //Mostrar los pilotos  que pertenecer a  una determinada temporada
   Optional<Temporada> findTemporadaBy(long temporada);

}






