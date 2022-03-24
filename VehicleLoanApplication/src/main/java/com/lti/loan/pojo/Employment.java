package com.lti.loan.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employment_details")
public class Employment 
{	
	@Id
	@Column(name="TYPE_OF_EMPLOYMENT")
	private String typeOfEmployment;
	
	@Column(name="ANNUAL_SALARY")
	private String annualSalary;
	
	@Column(name="EXISTING_EMI")
	private String existingEMI;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="APP_ID")
	private Personel appid;

	public Employment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employment(String typeOfEmployment, String annualSalary, String existingEMI, Personel appid) {
		super();
		this.typeOfEmployment = typeOfEmployment;
		this.annualSalary = annualSalary;
		this.existingEMI = existingEMI;
		this.appid = appid;
	}

	@Override
	public String toString() {
		return "Employment [typeOfEmployment=" + typeOfEmployment + ", annualSalary=" + annualSalary + ", existingEMI="
				+ existingEMI + ", appid=" + appid + "]";
	}

	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}

	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}

	public String getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(String annualSalary) {
		this.annualSalary = annualSalary;
	}

	public String getExistingEMI() {
		return existingEMI;
	}

	public void setExistingEMI(String existingEMI) {
		this.existingEMI = existingEMI;
	}

	public Personel getAppid() {
		return appid;
	}

	public void setAppid(Personel appid) {
		this.appid = appid;
	}
	
	
	
	
}
