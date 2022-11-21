package com.college.staffDetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BloodGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bloodgroupid;
	private String bloodgroup;
	public Integer getBloodgroupid() {
		return bloodgroupid;
	}
	public void setBloodgroupid(Integer bloodgroupid) {
		this.bloodgroupid = bloodgroupid;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public BloodGroup(Integer bloodgroupid, String bloodgroup) {
		super();
		this.bloodgroupid = bloodgroupid;
		this.bloodgroup = bloodgroup;
	}
	public BloodGroup() {
		super();
	}
}
