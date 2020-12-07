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
@Table(name = "bottleDetail")
@EntityListeners(AuditingEntityListener.class)
public class BottleDetail {
	@Id
	@Column(name = "bottle_detail_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bottleDetailId;

	@Column(name = "bottle_type")
	private String bottleType;
	
	@Column(name = "bottle_mrp")
	private int bottleMrp;
	
	@Column(name = "bottle_capacity")
	private int bottleCapacity;

	@Column(name = "bottle_brand")
	private String bottleBrand;

	public int getBottleDetailId() {
		return bottleDetailId;
	}

	public void setBottleDetailId(int bottleDetailId) {
		this.bottleDetailId = bottleDetailId;
	}

	public String getBottleType() {
		return bottleType;
	}

	public void setBottleType(String bottleType) {
		this.bottleType = bottleType;
	}

	public int getBottleMrp() {
		return bottleMrp;
	}

	public void setBottleMrp(int bottleMrp) {
		this.bottleMrp = bottleMrp;
	}

	public int getBottleCapacity() {
		return bottleCapacity;
	}

	public void setBottleCapacity(int bottleCapacity) {
		this.bottleCapacity = bottleCapacity;
	}

	public String getBottleBrand() {
		return bottleBrand;
	}

	public void setBottleBrand(String bottleBrand) {
		this.bottleBrand = bottleBrand;
	}

	public BottleDetail(int bottleDetailId, String bottleType, int bottleMrp, int bottleCapacity, String bottleBrand) {
		super();
		this.bottleDetailId = bottleDetailId;
		this.bottleType = bottleType;
		this.bottleMrp = bottleMrp;
		this.bottleCapacity = bottleCapacity;
		this.bottleBrand = bottleBrand;
	}

	public BottleDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
