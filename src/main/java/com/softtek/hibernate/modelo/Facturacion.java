package com.softtek.hibernate.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="facturaciones")
public class Facturacion {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idFacturacion;

    private int sueldo;

    private int publicidad;
    @ToString.Exclude
    @OneToOne(mappedBy = "facturacion",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Piloto piloto;
}
