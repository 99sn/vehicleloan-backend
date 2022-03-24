package com.lti.loan.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle_details")
public class Vehicle 
{	
	@Id
	
	@Column(name="CAR_MAKE")
	private String carMake;
	
	@Column(name="CAR_MODEL")
	private String carModel;
	
	@Column(name="EX_SHOWROOM_PRICE")
	private String exShowroomPrice;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="APP_ID")
	private Personel appid;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String carMake, String carModel, String exShowroomPrice, Personel appid) {
		super();
		this.carMake = carMake;
		this.carModel = carModel;
		this.exShowroomPrice = exShowroomPrice;
		this.appid = appid;
	}

	@Override
	public String toString() {
		return "Vehicle [carMake=" + carMake + ", carModel=" + carModel + ", exShowroomPrice=" + exShowroomPrice
				+ ", appid=" + appid + "]";
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getExShowroomPrice() {
		return exShowroomPrice;
	}

	public void setExShowroomPrice(String exShowroomPrice) {
		this.exShowroomPrice = exShowroomPrice;
	}

	public Personel getAppid() {
		return appid;
	}

	public void setAppid(Personel appid) {
		this.appid = appid;
	}

	
	
}
