package com.homemate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.homemate.entities.AdminTbl;
@Repository
public interface AdminRepository extends JpaRepository<AdminTbl,Integer>{
	
	@Query(value="SELECT * FROM ADMIN_TBL C WHERE C.USERNAME=:username AND C.PASSWORD=:password",nativeQuery = true)
	public AdminTbl loginAdmin(@Param("username") String username,@Param("password") String password);
	

}
