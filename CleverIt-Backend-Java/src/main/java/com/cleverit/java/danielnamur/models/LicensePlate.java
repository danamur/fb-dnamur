package com.cleverit.java.danielnamur.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LicensePlate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String idUser;
	private String alias;
	private String licensePlate;
	
	public LicensePlate() {
		
	}
	
	public LicensePlate(Integer id, String alias, String idUser, String licensePlate) {
		this.id = id;
		this.idUser = idUser;
		this.alias = alias;
		this.licensePlate = licensePlate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	
	
	
}
