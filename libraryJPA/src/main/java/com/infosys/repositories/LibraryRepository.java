package com.infosys.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infosys.entities.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
    List<Library> findByBname(String bname);
    List<Library> findByAname(String aname);
    
	@Query("select b from Library b where b.available=:a")
	public List<Library> getBookByAvailability(@Param("a") Boolean available);	
}
