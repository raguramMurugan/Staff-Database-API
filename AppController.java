package com.college.staffDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.staffDetails.dto.StaffDto;
import com.college.staffDetails.entity.BloodGroup;
import com.college.staffDetails.entity.Certification;
import com.college.staffDetails.entity.Department;
import com.college.staffDetails.entity.Designation;
import com.college.staffDetails.entity.Education;
import com.college.staffDetails.entity.EmploymentHistory;
import com.college.staffDetails.entity.Staff;
import com.college.staffDetails.service.StaffService;

@RestController
@RequestMapping("/StaffDetails")
public class AppController {

	@Autowired
	private StaffService staffservice;
	
	@GetMapping("/getDepartment")
	public Department fetchingDepartment(StaffDto staffdto)
	{
		return staffservice.fetchingDepartment(staffdto.getDepartmentId());
	}
	
	
	
	@GetMapping("/getStaffDetails")	
	public List<Staff> fetchStaffDetails()
	{
		return staffservice.fetchStaffDetails();
	}
	
	@PostMapping("/saveStaffDetails")
	public Staff saveStaffDetails(@RequestBody StaffDto staffdto)
	{
		return staffservice.saveStaffDetails(staffdto);
	}
	
	@PutMapping("/updateStaffDetails/{staffId}")
	public Staff updateStaffDetails(@PathVariable Integer staffId,@RequestBody StaffDto staffdto)
	{
		return staffservice.updateStaffDetails(staffId,staffdto);
	}
	
	@DeleteMapping("/deleteStaffdetails/{staffid}")
	public String deleteStaffdetails(@PathVariable Integer staffid)
	{
		staffservice.deleteStaffdetails(staffid);
		return "The Selected Rows Deleted Successfully";
	}
	
	@GetMapping("/getDesignation")
	public Designation fetchingDesignation(StaffDto staffdto)
	{
		return staffservice.fetchingDesignation(staffdto.getDesignationId());
	}
	
	@GetMapping("/saveBloodGroup")
	public BloodGroup saveBloodGroup(StaffDto staffdto)
	{
		return staffservice.saveBloodGroup(staffdto.getBloodgroupid());
	}
	
	@GetMapping("/getStafflastName/{lastName}")
	public Staff findByFirstName(@PathVariable String lastName)
	{
		return staffservice.findByLastName(lastName);
	}
	
	@GetMapping("/getEducationDetail")
	public List<Education> getEducationDetails()
	{
		return staffservice.getEducationDetails();
	}
	
	@GetMapping("/getEmploymentHistoryDetail")
	public List<EmploymentHistory> getEmploymentHistoryDetails()
	{
		return staffservice.getEmploymentHistoryDetails();
	}
	
	@GetMapping("/getCertifcateDetails")
	public List<Certification> getCertificateDetails()
	{
		return staffservice.getCertificateDetails();
	}
	
	@PutMapping("/updateEducationDetail/{eid}")
	public Education updateEducationDetails(@PathVariable Integer eid,@RequestBody Education education)
	{
		return staffservice.updateEducationDetails(eid,education);
	}
	
	@DeleteMapping("/deleteEducationDetail/{eid}")
	public String deleteEducataionDetails(@PathVariable Integer eid)
	{
		staffservice.deleteEducataionDetails(eid);
		return "Selected Rows Deleted Successfully";
	}
	@PutMapping("/updateEmploymentHistoryDetail/{hid}")
	public EmploymentHistory updateEmploymentHistoryDetails(@PathVariable Integer hid,@RequestBody EmploymentHistory history)
	{
		return staffservice.updateEmploymentHistoryDetails(hid,history);
	}
	@DeleteMapping("/deleteEmployementHistory/{hid}")
	public String deleteEmploymentHistory(@PathVariable Integer hid)
	 {
		 staffservice.deleteEmploymentHistory(hid);
		 return "Selected Rows Deleted Successfully";
	 }
	
	@PutMapping("/updateCertificateDetails/{certificateId}")
	public Certification updateCertificateDetails(@PathVariable Integer certificateId, @RequestBody Certification certification )
	{
		return staffservice.updateCertificateDetails(certificateId, certification);
	}
	
	@DeleteMapping("/deleteCertifcateDetails/{certificateId}")
	public String deleteCertificateDetails(@PathVariable Integer certificateId)
	{
		 staffservice.deleteCertificateDetails(certificateId);
		 return "Selected Rows Deleted";
	}
}
