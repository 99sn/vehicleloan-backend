package com.lti.loan.pojo;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.lti.loan.pojo.Personel;

@Entity
@Table(name="personal_details")
public class Personel 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="APP_ID")
	private int appid;

    @Column(name="FIRST_NAME")
	private String firstName;
    
    @Column(name="LAST_NAME")
	private String lastName;
    
    @Column(name="DOB")
	private Date dob;
    
    @Column(name="GENDER")
	private String gender;
    
    @Column(name="MOBILE_NO")
	private String mobileNo;
    
    @Column(name="EMAIL_ID")
	private String mailId;
    
    @Column(name="ADDRESS")
	private String address;
    
    @Column(name="STATE")
	private String state;
    
    @Column(name="CITY")
	private String city;
    
    @Column(name="PINCODE")
	private String princode;
    
    @Column(name="ADHAR_CARD")
	private String adhar;
    
    @Column(name="PAN_NO")
	private String pan;
    
	public Personel(int appid, String firstName, String lastName, Date dob, String gender, String mobileNo,
			String mailId, String address, String state, String city, String princode, String adhar, String pan) {
		super();
		this.appid = appid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.mailId = mailId;
		this.address = address;
		this.state = state;
		this.city = city;
		this.princode = princode;
		this.adhar = adhar;
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Personel [appid=" + appid + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", mobileNo=" + mobileNo + ", mailId=" + mailId + ", address=" + address
				+ ", state=" + state + ", city=" + city + ", princode=" + princode + ", adhar=" + adhar + ", pan=" + pan
				+ "]";
	}

	public Personel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAppid() {
		return appid;
	}

	public void setAppid(int personel) {
		this.appid = personel;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPrincode() {
		return princode;
	}

	public void setPrincode(String princode) {
		this.princode = princode;
	}

	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	
    
}
