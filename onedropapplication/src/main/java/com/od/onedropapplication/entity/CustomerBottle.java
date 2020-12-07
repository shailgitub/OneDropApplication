package com.od.onedropapplication.entity;

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
@Table(name = "customerBottle")
@EntityListeners(AuditingEntityListener.class)
public class CustomerBottle {
	@Id
	@Column(name = "cst_bottle_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cstBottleId;
	
	@Column(name = "cst_bottle_final_price")
	private int cstBottleFinalPrice;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BottleDetail bottleDetail;

	public int getCstBottleId() {
		return cstBottleId;
	}

	public void setCstBottleId(int cstBottleId) {
		this.cstBottleId = cstBottleId;
	}

	public int getCstBottleFinalPrice() {
		return cstBottleFinalPrice;
	}

	public void setCstBottleFinalPrice(int cstBottleFinalPrice) {
		this.cstBottleFinalPrice = cstBottleFinalPrice;
	}

	public BottleDetail getBottleDetail() {
		return bottleDetail;
	}

	public void setBottleDetail(BottleDetail bottleDetail) {
		this.bottleDetail = bottleDetail;
	}

	public CustomerBottle(int cstBottleId, int cstBottleFinalPrice, BottleDetail bottleDetail) {
		super();
		this.cstBottleId = cstBottleId;
		this.cstBottleFinalPrice = cstBottleFinalPrice;
		this.bottleDetail = bottleDetail;
	}

	public CustomerBottle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
