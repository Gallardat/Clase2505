package com.softtek.hibernate.servicio;

import com.softtek.hibernate.modelo.Escuderia;
import com.softtek.hibernate.repositorio.IEscuderiaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EscuderiaServicio implements IEscuderiServicio{

    @Autowired
    IEscuderiaRepositorio repo;

    @Override
    public Escuderia obtenerUna(Long idescuderia) {
        return repo.findById(idescuderia).orElse(new Escuderia());
    }
}
