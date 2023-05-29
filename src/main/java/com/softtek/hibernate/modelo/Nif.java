package com.softtek.hibernate.modelo;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nif")
public class Nif {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idNif;

    private char letra;

    private long numero;


}
