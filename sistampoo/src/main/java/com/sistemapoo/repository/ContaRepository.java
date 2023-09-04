package com.sistemapoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sistemapoo.entity.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, String>{

}
