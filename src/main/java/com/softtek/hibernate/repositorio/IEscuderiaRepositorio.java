package com.softtek.hibernate.repositorio;

import com.softtek.hibernate.modelo.Escuderia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEscuderiaRepositorio extends JpaRepository<Escuderia, Long> {



}
