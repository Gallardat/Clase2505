package com.softtek.hibernate;

import com.softtek.hibernate.modelo.Piloto;
import com.softtek.hibernate.modelo.Temporada;
import com.softtek.hibernate.repositorio.IPilotoRepo;
import com.softtek.hibernate.repositorio.ITemporadaRepo;
import com.softtek.hibernate.servicio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {


    @Autowired
    IPilotoSer pilotoServicio;

    @Autowired
    IPilotoRepo pilotoRepo;

    @Autowired
    ITemporadaSer temporadaServicio;

    @Autowired
    TelefonoServicio telefonoServicio;

    @Autowired
    ITemporadaRepo temporadaRepo;

    public static void main(String[] args) {
        SpringApplication.run(HibernateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("-------------------------------------------");

        Optional<Temporada> optionalTemporada=temporadaRepo.findTemporadaBy(1);

        if(optionalTemporada.isPresent()){
            Temporada temporada=optionalTemporada.get();
            List<Piloto> pilotos=pilotoRepo.findByTemporadas(temporada);
            pilotos.forEach(System.out::println);
        }
        else
            System.out.println(
                    "La temporada con el ID especificado no existe"
            );

        pilotoServicio.mostrarPorEscuderia(1l).forEach(p-> System.out.println("Pilodos por escuderia   "+p.getNombrePiloto()));

        pilotoServicio.mostrarSueldo().forEach(p-> System.out.println("Pilotos con sueldo mayor a 1000 "+p.getNombrePiloto()));

        pilotoServicio.mostrarPublicidad(10,20).forEach(p-> System.out.println("Pilotos que cobra por publicidad "+p.getNombrePiloto()));

        pilotoServicio.mostrarEscuderiaNoItaliana().forEach(p-> System.out.println("Pilotos que no sea de la escuderia italiana "+p.getNombrePiloto()));

        telefonoServicio.telefonosAlfonso().forEach(p-> System.out.println("Telefonos de alfonso "+p));
    }

}
