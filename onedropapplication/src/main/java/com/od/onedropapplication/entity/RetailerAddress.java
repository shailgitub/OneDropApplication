package com.od.onedropapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "rtlAddress")
@EntityListeners(AuditingEntityListener.class)
public class RetailerAddress {
	@Id
	@Column(name = "rtl_add_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rtlAddressId;

	@Column(name = "rtl_Shope_No")
	private String rtlShopeNo;

	@Column(name = "rtl_street")
	private String rtlStreet;

	@Column(name = "rtl_area")
	private String rtlArea;

	@Column(name = "rtl_city")
	private String rtlCity;

	@Column(name = "rtl_state")
	private String rtlState;

	@Column(name = "rtl_pin")
	private String rtlPin;

	@Column(name = "rtl_landmart")
	private String rtlLandmart;

	

	public int getRtlAddressId() {
		return rtlAddressId;
	}

	public void setRtlAddressId(int rtlAddressId) {
		this.rtlAddressId = rtlAddressId;
	}

	public String getRtlShopeNo() {
		return rtlShopeNo;
	}

	public void setRtlShopeNo(String rtlShopeNo) {
		this.rtlShopeNo = rtlShopeNo;
	}

	public String getRtlStreet() {
		return rtlStreet;
	}

	public void setRtlStreet(String rtlStreet) {
		this.rtlStreet = rtlStreet;
	}

	public String getRtlArea() {
		return rtlArea;
	}

	public void setRtlArea(String rtlArea) {
		this.rtlArea = rtlArea;
	}

	public String getRtlCity() {
		return rtlCity;
	}

	public void setRtlCity(String rtlCity) {
		this.rtlCity = rtlCity;
	}

	public String getRtlState() {
		return rtlState;
	}

	public void setRtlState(String rtlState) {
		this.rtlState = rtlState;
	}

	public String getRtlPin() {
		return rtlPin;
	}

	public void setRtlPin(String rtlPin) {
		this.rtlPin = rtlPin;
	}

	public String getRtlLandmart() {
		return rtlLandmart;
	}

	public void setRtlLandmart(String rtlLandmart) {
		this.rtlLandmart = rtlLandmart;
	}

	public RetailerAddress(int rtlAddressId, String rtlShopeNo, String rtlStreet, String rtlArea, String rtlCity,
			String rtlState, String rtlPin, String rtlLandmart) {
		super();
		this.rtlAddressId = rtlAddressId;
		this.rtlShopeNo = rtlShopeNo;
		this.rtlStreet = rtlStreet;
		this.rtlArea = rtlArea;
		this.rtlCity = rtlCity;
		this.rtlState = rtlState;
		this.rtlPin = rtlPin;
		this.rtlLandmart = rtlLandmart;
	}

	public RetailerAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

}
