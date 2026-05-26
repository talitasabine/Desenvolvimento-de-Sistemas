package com.example.hospedagem_de_sites.repository;

import com.example.hospedagem_de_sites.entity.RegistroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository<RegistroEntity, Long> {
}