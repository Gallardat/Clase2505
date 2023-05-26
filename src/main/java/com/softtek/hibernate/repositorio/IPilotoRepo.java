package com.softtek.hibernate.repositorio;

import com.softtek.hibernate.modelo.Piloto;
import com.softtek.hibernate.modelo.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPilotoRepo extends JpaRepository<Piloto, Long> {


    @Query( " from Piloto p")
    List<Piloto> obtenerPilotos();



    //Mostrar los pilotos de una escuderia
    @Query("from Piloto p where p.escuderia.idEcuderia=:escuderia")
    List<Piloto> mostrarPorEscuderia(@Param("escuderia") Long escuderia);

    //Mostrar los pilotos con un sueldo superior a 1000
    @Query("from Piloto p where p.facturacion.sueldo>1000")
    List<Piloto> mostrarSueldo();

    // Mostrar los pilotos que cobren por publicidad entre los valores
    @Query("from Piloto p where p.facturacion.publicidad between :valor1 and :valor2")
    List<Piloto> mostrarPublicidad(@Param("valor1") Integer valor1, @Param("valor2") Integer valor2);

    //Mostrar los pilotos que no sean de la escuderia italiana
    @Query("from Piloto p where p.escuderia.pais <> 'Italia'")
    List<Piloto> mostrarEscuderiaNoItaliana();


    List<Piloto> findByTemporadas(Temporada temporada);
}
