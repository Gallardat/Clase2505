package com.softtek.hibernate.repositorio;

import com.softtek.hibernate.modelo.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITelefonoRepo extends JpaRepository<Telefono, Integer> {


    //Mostrar todos los telefonos de alfonso
    @Query("from Telefono t where t.pilotos.nombrePiloto ='alfonso'")
    List<Telefono> telefonosAlfonso();
}
