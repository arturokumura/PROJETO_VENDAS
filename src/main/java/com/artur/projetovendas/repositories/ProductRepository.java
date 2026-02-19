package com.artur.projetovendas.repositories;

import com.artur.projetovendas.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
