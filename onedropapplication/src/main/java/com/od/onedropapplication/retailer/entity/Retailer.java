package com.od.onedropapplication.retailer.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "retailer")
@EntityListeners(AuditingEntityListener.class)
public class Retailer {
	@Id
	@Column(name = "retailer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int retailerId;

	@Column(name = "retailer_name")
	private String retailerName;
	
	@Column(name = "retailer_contact")
	private String retailerContact;
	
	@Column(name = "retailer_email")
	private String retailerEmail;
	
	@Column(name = "retailer_alter_contact")
	private String retailerAlterContact;

	@OneToOne(cascade = CascadeType.ALL)
	private RetailerAddress retailerAddress;
	
	public RetailerAddress getRetailerAddress() {
		return retailerAddress;
	}

	public void setRetailerAddress(RetailerAddress retailerAddress) {
		this.retailerAddress = retailerAddress;
	}

	public int getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	public String getRetailerContact() {
		return retailerContact;
	}

	public void setRetailerContact(String retailerContact) {
		this.retailerContact = retailerContact;
	}

	public String getRetailerEmail() {
		return retailerEmail;
	}

	public void setRetailerEmail(String retailerEmail) {
		this.retailerEmail = retailerEmail;
	}

	public String getRetailerAlterContact() {
		return retailerAlterContact;
	}

	public void setRetailerAlterContact(String retailerAlterContact) {
		this.retailerAlterContact = retailerAlterContact;
	}

	public Retailer(int retailerId, String retailerName, String retailerContact, String retailerEmail,
			String retailerAlterContact) {
		super();
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.retailerContact = retailerContact;
		this.retailerEmail = retailerEmail;
		this.retailerAlterContact = retailerAlterContact;
	}

	public Retailer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
