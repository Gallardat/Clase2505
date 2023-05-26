package com.softtek.hibernate.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
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
