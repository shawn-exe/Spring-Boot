package com.infosys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.entities.Library;

public interface libraryRepository extends JpaRepository<Library, Integer>{

}
