package com.example.educationalloan.Repository;


	import org.springframework.data.jpa.repository.JpaRepository;

import com.example.educationalloan.Model.AdminModel;


	public interface AdminRepo extends JpaRepository<AdminModel,String>{

	}
