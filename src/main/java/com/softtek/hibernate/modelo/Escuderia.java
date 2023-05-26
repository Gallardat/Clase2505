package com.softtek.hibernate.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "escuderias")
public class Escuderia {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idEcuderia;

    @Column(length = 20,nullable = false)
    private String nombre;

    @Column(length = 20,nullable = false)
    private String pais;

    @OneToMany(mappedBy = "escuderia",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<Piloto> pilotos;


}
