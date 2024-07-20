package com.infosys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infosys.exception.ResourceNotFoundException;
import com.infosys.model.College;
import com.infosys.model.Student;
import com.infosys.repository.CollegeRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Service
@Transactional
public class CollegeServiceImpl implements CollegeService{
	
	@PersistenceContext
    private EntityManager entityManager;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private CollegeRepository clgRepo;
	
	@Override
	public College saveCollege(College college) {
		clgRepo.save(college);
		return college;
	}

	@Override
	public List<College> getAllColleges() {
		// TODO Auto-generated method stub
				return clgRepo.findAll();
	}

	
    @Override
    public College getCollegeById(Long cid) {
        Optional<College> collegeOpt = clgRepo.findById(cid);
        if (collegeOpt.isPresent()) {
            College college = collegeOpt.get();
            
            Student student = restTemplate.getForObject("http://localhost:8081/students/"+cid, Student.class);

            student = entityManager.merge(student);
            college.setStudent(student);
            
            return college;
        } else {
            throw new ResourceNotFoundException("college", "Id", cid);
        }
    }

	@Override
	public College updateCollege(College college, Long cid) {
		// TODO Auto-generated method stub
		College existCLG=clgRepo.findById(cid).orElseThrow(()->
		new ResourceNotFoundException("student", "Id", cid));
		existCLG.setCname(college.getCname());
		existCLG.setPlace(college.getPlace());
		clgRepo.save(existCLG);
		return existCLG;	}

	@Override
	public void deleteCollege(Long cid) {
		clgRepo.deleteById(cid);		
		
	}

}
