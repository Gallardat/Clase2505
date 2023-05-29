package com.softtek.hibernate.modelo;

import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = false)
@Entity
@Table(name="facturaciones")
public class Facturacion {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idFacturacion;

    private int sueldo;

    private int publicidad;


    @OneToOne(mappedBy = "facturacion",cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    Piloto piloto;
}
