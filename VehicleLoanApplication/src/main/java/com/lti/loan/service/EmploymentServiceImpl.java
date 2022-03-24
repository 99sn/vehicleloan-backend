package com.lti.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.loan.dao.EmploymentDAO;
import com.lti.loan.pojo.Employment;
import com.lti.loan.pojo.Loan;
import com.lti.loan.pojo.Personel;
import com.lti.loan.pojo.RegistrationForm;
import com.lti.loan.pojo.Vehicle;

@Service
@Transactional   //spring transaction
public class EmploymentServiceImpl implements EmploymentService
{
	@Autowired
	EmploymentDAO edao;
	
	//Employment Details
	@Override
	public List<Employment> getEmploymentDetails() 
	{
		return edao.getEmploymentDetails();
	}

	@Override
	public boolean addEmploymentDetails(Employment employment, int appid) 
	{
		return edao.addEmploymentDetails(employment, appid);
	}
	
	//Vehicle Details
	@Override
	public List<Vehicle> getVehicleDetails() 
	{
		return edao.getVehicleDetails();
	}

	@Override
	public boolean addVehicleDetails(Vehicle vehicle, int appid) 
	{
		return edao.addVehicleDetails(vehicle, appid);
	}
	
	//Loan Details
	@Override
	public List<Loan> getLoanDetails() 
	{
		return edao.getLoanDetails();
	}

	@Override
	public boolean addLoanDetails(Loan loan, int appid) 
	{
		return edao.addLoanDetails(loan, appid);
	}
	
	@Override
	public List<Loan> searchLoanDetails(int appid) 
	{
		return edao.searchLoanDetails(appid);
	}
	
	
	//Personel Details
	@Override
	public List<Personel> getPersonelDetails() 
	{
		return edao.getPersonelDetails();
	}

	@Override
	public Personel addPersonelDetails(Personel personel) 
	{
		return edao.addPersonelDetails(personel);
	}




}
