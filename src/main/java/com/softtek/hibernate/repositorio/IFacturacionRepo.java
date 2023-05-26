package com.softtek.hibernate.repositorio;

import com.softtek.hibernate.modelo.Facturacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacturacionRepo extends JpaRepository<Facturacion, Long> {
}
