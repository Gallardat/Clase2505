package com.softtek.hibernate.servicio;

import com.softtek.hibernate.modelo.Piloto;
import com.softtek.hibernate.modelo.Temporada;
import com.softtek.hibernate.repositorio.IPilotoRepo;
import com.softtek.hibernate.repositorio.ITemporadaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPilotoSer implements IPilotoServicio {

    @Autowired
    IPilotoRepo pilotoRepo;

    @Override
    public List<Piloto> mostrarPorEscuderia(Long escuderia) {
        return pilotoRepo.mostrarPorEscuderia(escuderia);
    }

    @Override
    public List<Piloto> mostrarSueldo() {
        return pilotoRepo.mostrarSueldo();
    }

    @Override
    public List<Piloto> mostrarPublicidad(Integer valor1, Integer valor2) {
        return pilotoRepo.mostrarPublicidad(valor1, valor2);
    }

    @Override
    public List<Piloto> mostrarEscuderiaNoItaliana() {
        return pilotoRepo.mostrarEscuderiaNoItaliana();
    }


}