package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.model.College;

public interface CollegeRepository extends JpaRepository<College, Long> {

}
