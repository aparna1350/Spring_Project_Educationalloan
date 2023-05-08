package com.example.educationalloan.Repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.example.educationalloan.Model.UserModel;


	@Repository
	public interface UserRepo extends JpaRepository<UserModel,Integer> {

	}
