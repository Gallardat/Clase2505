package com.softtek.hibernate.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "telefonos")
public class Telefono {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idTelefono;

    private long numero;

    @ToString.Exclude
    @ManyToOne
         @JoinColumn(name = "id_piloto",nullable = false,
         foreignKey = @ForeignKey(name = "fk_telefono_piloto"))
    Piloto pilotos;


}
