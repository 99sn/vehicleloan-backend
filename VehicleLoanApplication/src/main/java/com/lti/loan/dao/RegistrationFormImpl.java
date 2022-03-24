package com.lti.loan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.loan.pojo.Employment;
import com.lti.loan.pojo.Login;
import com.lti.loan.pojo.Personel;
import com.lti.loan.pojo.RegistrationForm;
@Repository
public class RegistrationFormImpl implements RegistrationFormDAO 
{
	
	@Autowired
	EntityManager eMan;

	@Override
	public boolean addVehicle(RegistrationForm registrationform) 
	{
		eMan.persist(registrationform);
		Login lg = new Login();
		lg.setEmail(registrationform.getEmail());
		lg.setPassword(registrationform.getPassword());
		eMan.persist(lg);
		return true;
	}

	@Override
	public List<RegistrationForm> getVehicles() 
	{
		
		return eMan.createQuery("from RegistrationForm").getResultList();
	}
	
	@Override
	public boolean updateRegistration(RegistrationForm registrationform) 
	{
		eMan.merge(registrationform);
		return true;
	}

	@Override
	public boolean validateLogin(String email, String password) 
	{
		Query qry2=eMan.createQuery("from Login log where log.email =?1 and log.password=?2");
		qry2.setParameter(1,email);
		qry2.setParameter(2,password);		
		List<Login> users=qry2.getResultList();		
			if(users.size()>0)
			return true;
			else
			return false;		
	}

	@Override
	public boolean adminvalidateLogin(String email, String password) 
	{
		
		Query qry2=eMan.createQuery("from AdminLogin log where log.email =?1 and log.password=?2");
		qry2.setParameter(1,email);
		qry2.setParameter(2,password);		
		List<Login> users=qry2.getResultList();		
			if(users.size()>0)
			return true;
			else
			return false;
	}

	
	
	@Override
	public List<Personel> searchUser(String mailId) 
	{
		Query qry2=eMan.createQuery("from Personel p where p.mailId=?1");
		qry2.setParameter(1,mailId);
		List<Personel> res=qry2.getResultList();
		return res;
	}

	@Override
	public List<Employment> searchAdmin(int appid) 
	{	
			Query qry2=eMan.createQuery("from Personel e where e.appid=?1");
			qry2.setParameter(1,appid);
			List<Employment> res=qry2.getResultList();
			return res;
	
	}

	


	
}
