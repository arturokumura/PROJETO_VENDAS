package com.artur.projetovendas.repositories;

import com.artur.projetovendas.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
