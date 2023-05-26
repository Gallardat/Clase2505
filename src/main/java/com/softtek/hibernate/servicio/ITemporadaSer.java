package com.softtek.hibernate.servicio;

import com.softtek.hibernate.modelo.Temporada;
import com.softtek.hibernate.repositorio.ITemporadaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ITemporadaSer implements ITemporadaServicio{

    @Autowired
    ITemporadaRepo temporadaRepo;

}
