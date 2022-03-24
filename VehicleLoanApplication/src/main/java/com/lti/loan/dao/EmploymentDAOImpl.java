package com.lti.loan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.loan.pojo.Employment;
import com.lti.loan.pojo.Loan;
import com.lti.loan.pojo.Personel;
import com.lti.loan.pojo.RegistrationForm;
import com.lti.loan.pojo.Vehicle;

@Repository
public class EmploymentDAOImpl implements EmploymentDAO
{
	@Autowired
	EntityManager eMan;
	
	//Employment Details
	@Override
	public List<Employment> getEmploymentDetails() 
	{
		return eMan.createQuery("from Employment").getResultList();
	}

	@Override
	public boolean addEmploymentDetails(Employment employment, int appid) 
	{
		//eMan.persist(employment);
		Personel p = eMan.find(Personel.class, appid);
		employment.setAppid(p);
		eMan.persist(employment);
		return true;
	}
	
	//Vehicle Details
	@Override
	public List<Vehicle> getVehicleDetails() 
	{
		return eMan.createQuery("from Vehicle").getResultList();
	}

	@Override
	public boolean addVehicleDetails(Vehicle vehicle, int appid) 
	{	
		Personel p = eMan.find(Personel.class, appid);
		vehicle.setAppid(p);
		eMan.persist(vehicle);
		return true;
	}
	
	//Loan Details
	@Override
	public List<Loan> getLoanDetails() 
	{
		return eMan.createQuery("from Loan").getResultList();
	}

	@Override
	public boolean addLoanDetails(Loan loan, int appid) 
	{	
		Personel p = eMan.find(Personel.class, appid);
		loan.setAppid(p);
		eMan.persist(loan);
		return true;
	}
	
	@Override
	public List<Loan> searchLoanDetails(int appid) 
	{
		Query qry2=eMan.createQuery("from Loan l where l.appid.appid=?1");
		qry2.setParameter(1,appid);
		List<Loan> res=qry2.getResultList();
		return res;
	}
	
	
	
	//Personel Details
	@Override
	public List<Personel> getPersonelDetails() 
	{
		return eMan.createQuery("from Personel").getResultList();
	}

	@Override
	public Personel addPersonelDetails(Personel personel) 
	{
		eMan.persist(personel);
		Personel p = eMan.find(Personel.class, personel.getAppid());
		return p;
	}



	


}
