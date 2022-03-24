package com.lti.loan.pojo;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="registrationform")
public class RegistrationForm 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="REGISTERID")
	private int registerId;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Column(name="LASTNAME")
	private String lastName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="MOBILENO")
	private long mobileNo;
	
	@Column(name="DOB")
	private Date dob;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="PINCODE")
	private String pinCode;
	
	public RegistrationForm() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrationForm(int registerId, String password, String firstName, String lastName, String email,
			String gender, long mobileNo, Date dob, int age, String address, String city, String state, String pinCode) 
	{
		super();
		this.registerId = registerId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.age = age;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() 
	{
		return "RegistrationForm [userId=" + registerId + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", gender=" + gender + ", mobileNo=" + mobileNo
				+ ", dob=" + dob + ", age=" + age + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", pinCode=" + pinCode + "]";
	}

	public int getRegisterId() 
	{
		return registerId;
	}

	public void setRegisterId(int registerId) 
	{
		this.registerId = registerId;
	}

	
	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	
	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	
	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}


	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	
	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gengder) 
	{
		this.gender = gender;
	}

	
	public long getMobileNo() 
	{
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) 
	{
		this.mobileNo = mobileNo;
	}


	public Date getDob() 
	{
		return dob;
	}

	public void setDob(Date dob) 
	{
		this.dob = dob;
	}


	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	
	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	
	public String getCity() 
	{
		return city;
	}

	public void setCity(String city) 
	{
		this.city = city;
	}


	public String getState() 
	{
		return state;
	}

	public void setState(String state) 
	{
		this.state = state;
	}


	public String getPinCode() 
	{
		return pinCode;
	}

	public void setPinCode(String pinCode) 
	{
		this.pinCode = pinCode;
	}
	
	
	

}
