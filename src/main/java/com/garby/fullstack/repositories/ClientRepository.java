package com.garby.fullstack.repositories;

import com.garby.fullstack.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Long> {

}
