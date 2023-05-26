package com.softtek.hibernate.servicio;

import com.softtek.hibernate.modelo.Telefono;
import com.softtek.hibernate.repositorio.ITelefonoRepo;
import com.softtek.hibernate.repositorio.ITemporadaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefonoServicio  implements  ITelefonoServicio{

    @Autowired
    ITelefonoRepo telefonorepo;
    @Override
    public List<Telefono> telefonosAlfonso() {
        return telefonorepo.telefonosAlfonso();
    }
}
