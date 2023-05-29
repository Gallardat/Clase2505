package com.softtek.hibernate.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "telefonos")
public class Telefono {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idTelefono;

    private long numero;

    @ManyToOne
         @JoinColumn(name = "id_piloto",nullable = false,
         foreignKey = @ForeignKey(name = "fk_telefono_piloto"))
    Piloto pilotos;


}
