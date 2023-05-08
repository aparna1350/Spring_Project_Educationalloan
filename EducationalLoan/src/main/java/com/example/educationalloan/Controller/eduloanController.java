package com.example.educationalloan.Controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

import com.example.educationalloan.Model.LoanApplicationModel;
import com.example.educationalloan.Model.UserModel;
import com.example.educationalloan.Service.eduloanService;

import io.swagger.v3.oas.annotations.tags.Tag;


	@RestController
	public class eduloanController {

		@Autowired
		eduloanService us;
		
		@Tag(name="Get",description="get data")
		@GetMapping("/getallUser")
		public List<UserModel> allDetails(){
			
			return us.getAllDetails();
		}
		
		@Tag(name="Get",description="get data")
		@GetMapping("/loginbyUsername")
		public String logins(@RequestParam String username, @RequestParam String password){
			
			return us.login(username,password);
		}
		@Tag(name="Post",description="post data")
		@PostMapping("/saveUser")
		public UserModel regid(@RequestBody UserModel id) {
			
			
			return us.register(id);
		}
		@PutMapping("/updateUser")
		public UserModel saveAlll(@RequestBody UserModel id) {
			
			return us.putDetails(id);
			
		}
		@GetMapping("/getallUser/{id}")
		public UserModel getId(@PathVariable int id) {
			
			return us.getDetailsById(id);
		}
		
		@DeleteMapping("/deletebyUser/{id}")
		public String deleteById(@PathVariable int id) {
			
			 us.deleteById(id);
			 return "Details Deleted";
		}
		@GetMapping("/getallLoan")
		public List<LoanApplicationModel> alDetails(){
			
			return us.getAlDetails();
		}
		@PostMapping("/saveloan")
		public LoanApplicationModel addloan(@RequestBody LoanApplicationModel id) {
			
			
			return us.add(id);
		}
		@PutMapping("/updateLoan")
		public LoanApplicationModel savemethod(@RequestBody LoanApplicationModel id) {
			
			return us.put(id);
			
		}
		@GetMapping("/getallLoan/{id}")
		public LoanApplicationModel getsId(@PathVariable int id) {
			
			return us.getDetailById(id);
		}
		@DeleteMapping("/deletebyLoan/{id}")
		public String deleted(@PathVariable int id) {
			
			us.deleteId(id);
			return "Details Deleted";
		}

		
	}
