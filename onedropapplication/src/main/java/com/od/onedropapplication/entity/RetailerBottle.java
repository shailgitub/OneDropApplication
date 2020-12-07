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
@Table(name = "retailerBottle")
@EntityListeners(AuditingEntityListener.class)
public class RetailerBottle {
	@Id
	@Column(name = "rtlr_bottle_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rtlrBottleId;
	
	@Column(name = "rtlr_bottle_final_price")
	private int rtlrBottleFinalPrice;
		
	@Column(name = "rtlr_bottle_stock")
	private int rtlrBottleStock;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BottleDetail bottleDetail;

	public int getRtlrBottleId() {
		return rtlrBottleId;
	}

	public void setRtlrBottleId(int rtlrBottleId) {
		this.rtlrBottleId = rtlrBottleId;
	}

	public int getRtlrBottleFinalPrice() {
		return rtlrBottleFinalPrice;
	}

	public void setRtlrBottleFinalPrice(int rtlrBottleFinalPrice) {
		this.rtlrBottleFinalPrice = rtlrBottleFinalPrice;
	}

	public int getRtlrBottleStock() {
		return rtlrBottleStock;
	}

	public void setRtlrBottleStock(int rtlrBottleStock) {
		this.rtlrBottleStock = rtlrBottleStock;
	}

	public BottleDetail getBottleDetail() {
		return bottleDetail;
	}

	public void setBottleDetail(BottleDetail bottleDetail) {
		this.bottleDetail = bottleDetail;
	}

	public RetailerBottle(int rtlrBottleId, int rtlrBottleFinalPrice, int rtlrBottleStock, BottleDetail bottleDetail) {
		super();
		this.rtlrBottleId = rtlrBottleId;
		this.rtlrBottleFinalPrice = rtlrBottleFinalPrice;
		this.rtlrBottleStock = rtlrBottleStock;
		this.bottleDetail = bottleDetail;
	}

	public RetailerBottle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
