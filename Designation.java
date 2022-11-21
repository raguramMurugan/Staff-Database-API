package com.college.staffDetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Designation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer desigId;
	private String currentDesignation;
	public Integer getDesigId() {
		return desigId;
	}
	public void setDesigId(Integer desigId) {
		this.desigId = desigId;
	}
	public String getCurrentDesignation() {
		return currentDesignation;
	}
	public void setCurrentDesignation(String currentDesignation) {
		this.currentDesignation = currentDesignation;
	}
	public Designation(Integer desigId, String currentDesignation) {
		super();
		this.desigId = desigId;
		this.currentDesignation = currentDesignation;
	}
	public Designation() {
		super();
	}
}
