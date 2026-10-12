package com.baozi.baozistore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.baozi.baozistore.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}