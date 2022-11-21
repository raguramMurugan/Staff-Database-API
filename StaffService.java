package com.college.staffDetails.service;

import java.util.List;

import com.college.staffDetails.dto.StaffDto;
import com.college.staffDetails.entity.BloodGroup;
import com.college.staffDetails.entity.Certification;
import com.college.staffDetails.entity.Department;
import com.college.staffDetails.entity.Designation;
import com.college.staffDetails.entity.Education;
import com.college.staffDetails.entity.EmploymentHistory;
/*import com.college.staffDetails.entity.Designation;*/
import com.college.staffDetails.entity.Staff;

public interface StaffService {

	public Department fetchingDepartment(Integer departmentId);

	public Staff saveStaffDetails(StaffDto staffdto);

	public Staff updateStaffDetails(Integer staffid, StaffDto staffdto);

	public List<Staff> fetchStaffDetails();

	public void deleteStaffdetails(Integer staffid);

	public Designation fetchingDesignation(Integer designationId);

	public BloodGroup saveBloodGroup(Integer bloodgroupid);

	public Staff findByLastName(String lastName);

	public List<Education> getEducationDetails();

	public List<EmploymentHistory> getEmploymentHistoryDetails();

	public List<Certification> getCertificateDetails();

	public Education updateEducationDetails(Integer eid, Education education);

	public void deleteEducataionDetails(Integer eid);

	public EmploymentHistory updateEmploymentHistoryDetails(Integer hid, EmploymentHistory history);

	public void deleteEmploymentHistory(Integer hid);

	public Certification updateCertificateDetails(Integer certificateId, Certification certification);

	public void deleteCertificateDetails(Integer certificateId);

	



	

	

	

	

	

}
