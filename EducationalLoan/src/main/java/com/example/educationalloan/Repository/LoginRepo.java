package com.example.educationalloan.Repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.example.educationalloan.Model.LoginModel;

	@Repository
	public interface LoginRepo extends JpaRepository <LoginModel,String>{

	}
