package com.softtek.hibernate;

import com.softtek.hibernate.modelo.Escuderia;
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
    ITemporadaSer temporadaServicio;

    @Autowired
    TelefonoServicio telefonoServicio;


    @Autowired
    IEscuderiServicio escuderiaServicio;

    public static void main(String[] args) {

        SpringApplication.run(HibernateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        obtenerTemporada();
        consultar2();
        System.out.println("----------------CON QUERY-------------------------");
        pilotoServicio.mostrarPorEscuderia(1L).forEach(p-> System.out.println("Pilodos por escuderia   "+p.getNombrePiloto()));
        
        pilotoServicio.mostrarSueldo().forEach(p-> System.out.println("Pilotos con sueldo mayor a 1000 "+p.getNombrePiloto()));

       pilotoServicio.mostrarPublicidad(10,20).forEach(p-> System.out.println("Pilotos que cobra por publicidad "+p.getNombrePiloto()));

        pilotoServicio.mostrarEscuderiaNoItaliana().forEach(p-> System.out.println("Pilotos que no sea de la escuderia italiana "+p.getNombrePiloto()));

        telefonoServicio.telefonosAlfonso().forEach(p-> System.out.println("Telefonos de alfonso "+p.getNumero()));
    }
    private void obtenerTemporada(){
        Temporada temporada =temporadaServicio.ObtenerTemporada(2l);
        temporada.getPilotos().stream()
                .map(p -> "piloto para la temporada asignada es id: "+p.getIdPiloto()+" nombre: "+p.getNombrePiloto())
                .forEach(System.out::println);
    }
    private void consultar2(){
        Escuderia e = escuderiaServicio.obtenerUna(1l);
        e.getPilotos().stream()
                .map(p->"piloto para la escuderia asignada es: id:"+p.getIdPiloto()+" nombre:"+p.getNombrePiloto())
                .forEach(System.out::println);
    }

}
