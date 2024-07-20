package com.infosys.service;

import java.util.List;

import com.infosys.model.College;

public interface CollegeService {

College saveCollege(College college);
	
	List<College> getAllColleges();
	
	College getCollegeById(Long cid);
	
	College updateCollege(College college, Long cid);
	
	void deleteCollege(Long cid);
	
}
