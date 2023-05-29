package com.softtek.hibernate.servicio;

import com.softtek.hibernate.modelo.Piloto;
import com.softtek.hibernate.modelo.Temporada;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;


public interface ITemporadaServicio {

    Temporada ObtenerTemporada(Long idtemporada);
}
