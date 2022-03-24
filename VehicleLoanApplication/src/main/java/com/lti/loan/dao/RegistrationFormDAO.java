package com.lti.loan.dao;

import java.util.List;

import com.lti.loan.pojo.Employment;
import com.lti.loan.pojo.Personel;
import com.lti.loan.pojo.RegistrationForm;

public interface RegistrationFormDAO 
{
	
	public boolean addVehicle(RegistrationForm registrationform );
	public List<RegistrationForm> getVehicles();
	public boolean updateRegistration(RegistrationForm registrationform);
	
	public boolean validateLogin(String email,String password);
		
	public boolean adminvalidateLogin(String email,String password);
	
	public List<Personel> searchUser(String mailId);
	public List<Employment> searchAdmin(int appid);



}
