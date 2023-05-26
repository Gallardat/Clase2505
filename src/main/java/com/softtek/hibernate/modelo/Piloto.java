package com.softtek.hibernate.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.web.JsonPath;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name="pilotos")
public class Piloto {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idPiloto;

    @Column(length=20,nullable = false)
    private String nombrePiloto;

    private int edad;
    @OneToOne
    @JoinColumn(name="id_facturacion", nullable=false,
            foreignKey = @ForeignKey(name="fk_piloto_facturacion"))
    Facturacion facturacion;

    @OneToOne
    @JoinColumn(name="id_nif", nullable=false,
            foreignKey = @ForeignKey(name="kf_piloto_nif"))
    Nif nif;

    @ManyToOne
    @JoinColumn(name="id_escuderia", nullable=false,
            foreignKey=@ForeignKey(name="fk_piloto_escuderia"))
    Escuderia escuderia;
    @OneToMany(mappedBy="pilotos", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Set<Telefono> telefonos;

    @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinTable(name = "temporadas_pilotos",
            joinColumns=@JoinColumn(name = "id_piloto", referencedColumnName = "idPiloto"),
            inverseJoinColumns = @JoinColumn(name = "id_temporada", referencedColumnName ="idTemporada"))
    private Set<Temporada> temporadas;


}
