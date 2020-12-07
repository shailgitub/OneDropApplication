package com.od.onedropapplication.customer.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "cst_add")
@EntityListeners(AuditingEntityListener.class)
public class CustomerAddress {

	@Id
	@Column(name = "cst_add_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cstAddressId;

	@Column(name = "cst_House_No")
	private String cstHouseNo;

	@Column(name = "cst_street")
	private String cstStreet;

	@Column(name = "cst_area")
	private String cstArea;

	@Column(name = "cst_city")
	private String cstCity;

	@Column(name = "cst_state")
	private String cstState;

	@Column(name = "cst_pin")
	private String cstPin;

	@Column(name = "cst_landmart")
	private String cstLandmart;

	public int getCstAddressId() {
		return cstAddressId;
	}

	public void setCstAddressId(int cstAddressId) {
		this.cstAddressId = cstAddressId;
	}

	public String getCstHouseNo() {
		return cstHouseNo;
	}

	public void setCstHouseNo(String cstHouseNo) {
		this.cstHouseNo = cstHouseNo;
	}

	public String getCstStreet() {
		return cstStreet;
	}

	public void setCstStreet(String cstStreet) {
		this.cstStreet = cstStreet;
	}

	public String getCstArea() {
		return cstArea;
	}

	public void setCstArea(String cstArea) {
		this.cstArea = cstArea;
	}

	public String getCstCity() {
		return cstCity;
	}

	public void setCstCity(String cstCity) {
		this.cstCity = cstCity;
	}

	public String getCstState() {
		return cstState;
	}

	public void setCstState(String cstState) {
		this.cstState = cstState;
	}

	public String getCstPin() {
		return cstPin;
	}

	public void setCstPin(String cstPin) {
		this.cstPin = cstPin;
	}

	public String getCstLandmart() {
		return cstLandmart;
	}

	public void setCstLandmart(String cstLandmart) {
		this.cstLandmart = cstLandmart;
	}

	public CustomerAddress(int cstAddressId, String cstHouseNo, String cstStreet, String cstArea, String cstCity,
			String cstState, String cstPin, String cstLandmart) {
		super();
		this.cstAddressId = cstAddressId;
		this.cstHouseNo = cstHouseNo;
		this.cstStreet = cstStreet;
		this.cstArea = cstArea;
		this.cstCity = cstCity;
		this.cstState = cstState;
		this.cstPin = cstPin;
		this.cstLandmart = cstLandmart;
	}

	public CustomerAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
