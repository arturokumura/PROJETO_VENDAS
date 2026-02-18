package com.artur.projetovendas.repositories;

import com.artur.projetovendas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
