package com.infosys.repositories;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infosys.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public List<User> findByName(String name);//Upto class-2
	
	//class-3
	//Using JPQL quries
	@Query("select u from User u")
	public List<User> getAllUsers();
	
	//Using Native query:
	@Query(value="select * from users",nativeQuery=true)
	public List<User> getAllUserss();
	
	public  List<User> findAllbyName(String city,Pageable pageable);
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	@Query("select u from User u where u.status=:s and u.city=:c")
//	public List<User> getUserByStatus(@Param("s") String status,@Param("c") String city);
//	
//	
//	@Query("select u from User u where u.name=:n and u.status=:s")
//	public List<User> getUserByNameandStatus(@Param("n") String name,@Param("s") String status);
//	
//	
//	@Query("select u from User u where u.id=:i and u.name=:n")
//	public List<User> getUserByIdandname(@Param("i") int id,@Param("n") String name);
//	
//	@Query("select u from User u where u.id=:i and u.city=:c")
//	public List<User> getUserByIdandCity(@Param("i") int id,@Param("c") String name);
//	
//	@Query("select u from User u where u.name=:n and u.city=:c")
//	public List<User> getUserByNameandCity(@Param("n") String name,@Param("c") String city);
//	
//	
//	@Query(value="select * from users where status=:s and city=:c", nativeQuery=true)
//	public List<User> getUserByStatusNative(@Param("s") String status, @Param("c") String city);
//
//	@Query(value="select * from users where name=:n and status=:s", nativeQuery=true)
//	public List<User> getUserByNameandStatusNative(@Param("n") String name, @Param("s") String status);
//
//	@Query(value="select * from users where id=:i and name=:n", nativeQuery=true)
//	public List<User> getUserByIdandnameNative(@Param("i") int id, @Param("n") String name);
//
//	@Query(value="select * from users where id=:i and city=:c", nativeQuery=true)
//	public List<User> getUserByIdandCityNative(@Param("i") int id, @Param("c") String city);
//
//	@Query(value="select * from users where name=:n and city=:c", nativeQuery=true)
//	public List<User> getUserByNameandCityNative(@Param("n") String name, @Param("c") String city);
//	

