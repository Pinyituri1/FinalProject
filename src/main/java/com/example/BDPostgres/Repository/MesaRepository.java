package com.example.BDPostgres.Repository;

import com.example.BDPostgres.Model.CierreCaja;
import com.example.BDPostgres.Model.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesaRepository extends JpaRepository<Mesa, Integer> {
}
