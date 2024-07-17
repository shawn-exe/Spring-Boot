package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.entities.Laptop;

public interface laptopRepo extends JpaRepository<Laptop, Integer>{

}
