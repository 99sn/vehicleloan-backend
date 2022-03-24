package com.lti.loan.service;

import java.util.List;

import com.lti.loan.pojo.Employment;
import com.lti.loan.pojo.Loan;
import com.lti.loan.pojo.Personel;
import com.lti.loan.pojo.RegistrationForm;
import com.lti.loan.pojo.Vehicle;

public interface EmploymentService 
{	
	//Employment details
	public List<Employment> getEmploymentDetails();
	public boolean addEmploymentDetails(Employment employment, int appid);
	
	//Vehicle Details
	public List<Vehicle> getVehicleDetails();
	public boolean addVehicleDetails(Vehicle vehicle, int appid);
	
	//Loan details
	public List<Loan> getLoanDetails();
	public boolean addLoanDetails(Loan loan, int appid);
	public List<Loan> searchLoanDetails(int appid);
	
	//Personel details
	public List<Personel> getPersonelDetails();
	public Personel addPersonelDetails(Personel personel);
	

}
