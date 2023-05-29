package com.softtek.hibernate.modelo;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Set;


@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "temporadas")
@Component
public class Temporada {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idTemporada;

    private int inicio;

    private int fin;
    @ToString.Exclude
    @ManyToMany(mappedBy="temporadas", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Piloto> pilotos;

}
