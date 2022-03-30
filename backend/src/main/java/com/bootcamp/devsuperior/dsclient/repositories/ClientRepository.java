package com.bootcamp.devsuperior.dsclient.repositories;

import com.bootcamp.devsuperior.dsclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <Client, Long> {
}
