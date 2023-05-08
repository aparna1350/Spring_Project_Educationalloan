package com.example.educationalloan.Repository;


	import org.springframework.data.jpa.repository.JpaRepository;

import com.example.educationalloan.Model.LoanApplicationModel;


	public interface LoanApplicationRepo extends JpaRepository <LoanApplicationModel,Integer>{

	}
