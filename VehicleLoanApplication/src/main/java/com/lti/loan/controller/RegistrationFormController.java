package com.lti.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.loan.pojo.Employment;
import com.lti.loan.pojo.Personel;
import com.lti.loan.pojo.RegistrationForm;
import com.lti.loan.service.RegistrationFormService;


@RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class RegistrationFormController {
	

	@Autowired
	RegistrationFormService rService;
	
	
	@GetMapping("/registrationform")
	public List<RegistrationForm> getVehicles()
	{
		return rService.getVehicles();
	}
	
	@PostMapping("/registrationform")
	public boolean addVehicle(@RequestBody RegistrationForm registrationform)
	{
		return rService.addVehicle(registrationform);
	}
	
	@PutMapping("/registrationform/update")
	public boolean updateRegistration(@RequestBody RegistrationForm registrationform)
	{
		return rService.updateRegistration(registrationform);
	}
	

	//validate login
	@GetMapping("/validatelogin/{email}/{password}") // Passing multiple arguments with url
	public boolean validateLogin(@PathVariable("email") String email,@PathVariable("password") String password)
	{
			return rService.validateLogin(email, password);
	}
	
	//validate admin
	@GetMapping("/loan/{email}/{password}") // Passing multiple arguments with url
	public boolean adminvalidateLogin(@PathVariable("email") String email,@PathVariable("password") String password)
	{
			return rService.adminvalidateLogin(email, password);
	}
	
	//search details by mailid
	@GetMapping("/searchuser/{mailId}") 
	public List<Personel> searchUser(@PathVariable("mailId")  String mailId)
	{
		return rService.searchUser(mailId);
	}
	
	//serach details by application id
	@GetMapping("/loan/{appid}") 
	public List<Employment> searchAdmin(@PathVariable("appid")  int appid)
	{
		return rService.searchAdmin(appid);
	}
}
