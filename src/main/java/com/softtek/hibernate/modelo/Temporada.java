package com.softtek.hibernate.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "temporadas")
@Component
public class Temporada {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idTemporada;

    private int inicio;

    private int fin;
    @ToString.Exclude
    @ManyToMany(mappedBy="temporadas", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Piloto> pilotos;

}
