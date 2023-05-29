package com.softtek.hibernate.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

    @OneToMany(mappedBy = "escuderia",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Piloto> pilotos;


}
