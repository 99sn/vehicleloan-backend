package com.lti.loan.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Loan_details")
public class Loan 
{	
	@Id
	@Column(name="LOAN_AMOUNT")
	private String loanAmount;
	
	@Column(name="LOAN_TENURE")
	private String loanTenure;
	
	@Column(name="RATE_OF_INTEREST")
	private String rateOfInterest;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="APP_ID")
	private Personel appid;

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(String loanAmount, String loanTenure, String rateOfInterest, Personel appid) {
		super();
		this.loanAmount = loanAmount;
		this.loanTenure = loanTenure;
		this.rateOfInterest = rateOfInterest;
		this.appid = appid;
	}

	@Override
	public String toString() {
		return "Loan [loanAmount=" + loanAmount + ", loanTenure=" + loanTenure + ", rateOfInterest=" + rateOfInterest
				+ ", appid=" + appid + "]";
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(String loanTenure) {
		this.loanTenure = loanTenure;
	}

	public String getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public Personel getAppid() {
		return appid;
	}

	public void setAppid(Personel appid) {
		this.appid = appid;
	}
	
	

	
}
