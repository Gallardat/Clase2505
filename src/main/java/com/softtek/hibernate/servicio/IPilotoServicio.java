package com.softtek.hibernate.servicio;

import com.softtek.hibernate.modelo.Piloto;
import com.softtek.hibernate.modelo.Temporada;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IPilotoServicio {



    void obtenerPilotos();

    List<Piloto> mostrarPorEscuderia( Long escuderia);
    List<Piloto> mostrarSueldo();
    List<Piloto> mostrarPublicidad( Integer valor1, Integer valor2);
    List<Piloto> mostrarEscuderiaNoItaliana();
}
