package com.springboot.restapi.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="items")
public class LoadClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String loadingpoint;
	
	@Column
	private String unloadingpoint;
	
	@Column
	private String producttype;
	
	@Column
	private String trucktype;
	
	@Column
	private long nooftrucks;
	
	@Column
	private long weight;
	
	@Column
	private String comments;
	
	@Column
	private String shipperid;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoadingpoint() {
		return loadingpoint;
	}

	public void setLoadingpoint(String loadingpoint) {
		this.loadingpoint = loadingpoint;
	}

	public String getUnloadingpoint() {
		return unloadingpoint;
	}

	public void setUnloadingpoint(String unloadingpoint) {
		this.unloadingpoint = unloadingpoint;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	public String getTrucktype() {
		return trucktype;
	}

	public void setTrucktype(String trucktype) {
		this.trucktype = trucktype;
	}

	public long getNooftrucks() {
		return nooftrucks;
	}

	public void setNooftrucks(long nooftrucks) {
		this.nooftrucks = nooftrucks;
	}

	public long getWeight() {
		return weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getShipperid() {
		return shipperid;
	}

	public void setShipperid(String shipperid) {
		this.shipperid = shipperid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@DateTimeFormat(pattern="dd-MM-yyyy")
	@Column
	private Date date;
	
	
	
}
