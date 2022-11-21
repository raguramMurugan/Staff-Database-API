package com.college.staffDetails.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.staffDetails.dto.StaffDto;
import com.college.staffDetails.entity.BloodGroup;
import com.college.staffDetails.entity.Certification;
import com.college.staffDetails.entity.Department;
import com.college.staffDetails.entity.Designation;
import com.college.staffDetails.entity.Education;
import com.college.staffDetails.entity.EmploymentHistory;
import com.college.staffDetails.entity.Staff;
import com.college.staffDetails.repository.BloodGroupRepo;
import com.college.staffDetails.repository.CertificationRepository;
import com.college.staffDetails.repository.DepartmentRepo;
import com.college.staffDetails.repository.DesignationRepo;
import com.college.staffDetails.repository.EducationRepository;
import com.college.staffDetails.repository.EmploymentHistoryRepository;
import com.college.staffDetails.repository.StaffRepository;

@Service
public class StaffServiceImplement implements StaffService {

	@Autowired
	BloodGroupRepo bloodrepo;
	
	@Autowired
	DesignationRepo desigrepo;
	
	@Autowired
	StaffRepository staffrepo;
	
	@Autowired
	DepartmentRepo departrepo;
	
	@Autowired
	EducationRepository educaterepo;
	
	@Autowired
	EmploymentHistoryRepository emphistrepo;

	@Autowired
	CertificationRepository certirepo;
	
	@Override
	public Department fetchingDepartment(Integer departmentId) {
		Department deptid=departrepo.findById(departmentId).get();
		
		departrepo.save(deptid);
		return deptid;
	}

	@Override
	public Staff saveStaffDetails(StaffDto staffdto) {
		
		System.out.println("This is Testing");
		Staff staff=new Staff();
		staff.setFirstName(staffdto.getFirstName());
		System.out.println(staffdto.getDepartmentId());
		staff.setDepartment(departrepo.findById(staffdto.getDepartmentId()).get());
		staff.setLastName(staffdto.getLastName());
		staff.setAddress(staffdto.getAddress());
		staff.setDateOfBirth(staffdto.getDateOfBirth());
		staff.setExInYears(staffdto.getExInYears());
		staff.setMobile(staffdto.getMobile());
		staff.setBloodgroup(bloodrepo.findById(staffdto.getBloodgroupid()).get());
		staff.setAchievement(staffdto.getAchievement());
		staff.setCertificate(staffdto.getCertificate());
		staff.setHistory(staffdto.getHistory());
		staff.setEducation(staffdto.getEducation());
		
		System.out.println(desigrepo.findById(staffdto.getDesignationId()).get());
		staff.setDesignation(desigrepo.findById(staffdto.getDesignationId()).get());
		
		return staffrepo.save(staff);
	}

	@Override
	public Staff updateStaffDetails(Integer staffid, StaffDto staffdto) {
		Staff staffdata=staffrepo.findById(staffid).get();
		
		if(Objects.nonNull(staffdto.getFirstName()) && !"".equalsIgnoreCase(staffdto.getFirstName()))
		{
			staffdata.setFirstName(staffdto.getFirstName());
		}
		
		if(Objects.nonNull(staffdto.getLastName()) && !"".equalsIgnoreCase(staffdto.getLastName()))
		{
			staffdata.setLastName(staffdto.getLastName());
		}
		
		if(Objects.nonNull(staffdto.getDateOfBirth()) && !"".equalsIgnoreCase(staffdto.getDateOfBirth()))
		{
			staffdata.setDateOfBirth(staffdto.getDateOfBirth());
		}
		
	
		
		if(Objects.nonNull(staffdto.getExInYears()) && !"".equalsIgnoreCase(staffdto.getExInYears()))
		{
			staffdata.setExInYears(staffdto.getExInYears());
		}
		
		if(Objects.nonNull(staffdto.getMobile()) && !"".equalsIgnoreCase(staffdto.getMobile()))
		{
			staffdata.setMobile(staffdto.getMobile());
		}
		
		if(Objects.nonNull(staffdto.getAddress()) && !"".equalsIgnoreCase(staffdto.getAddress()))
		{
			staffdata.setAddress(staffdto.getAddress());
		}
		
		
		
		return staffrepo.save(staffdata);
	}

	@Override
	public List<Staff> fetchStaffDetails() {
		return staffrepo.findAll();
	}

	@Override
	public void deleteStaffdetails(Integer staffid) {
		staffrepo.deleteById(staffid);
		
	}

	@Override
	public Designation fetchingDesignation(Integer designationId) {
		Designation getDesigId=desigrepo.findById(designationId).get();
		
		desigrepo.save(getDesigId);
		return getDesigId;
	}

	@Override
	public BloodGroup saveBloodGroup(Integer bloodgroupid) {
		BloodGroup blooddata=bloodrepo.findById(bloodgroupid).get();
		bloodrepo.save(blooddata);
		return blooddata;
	}

	@Override
	public Staff findByLastName(String lastName) {
		
		return staffrepo.findByLastName(lastName);
	}

	@Override
	public List<Education> getEducationDetails() {
		return educaterepo.findAll();
	}

	@Override
	public List<EmploymentHistory> getEmploymentHistoryDetails() {

		return emphistrepo.findAll();
	}

	@Override
	public List<Certification> getCertificateDetails() {
	
		return certirepo.findAll();
	}

	@Override
	public Education updateEducationDetails(Integer eid, Education education) {
		Education edudata=educaterepo.findById(eid).get();
		
		if(Objects.nonNull(education.getCollegeName()) && !"".equalsIgnoreCase(education.getCollegeName()))
		{
			edudata.setCollegeName(education.getCollegeName());
		}

		if(Objects.nonNull(education.getCollegeAddress()) && !"".equalsIgnoreCase(education.getCollegeAddress()))
		{
			edudata.setCollegeAddress(education.getCollegeAddress());
		}
		if(Objects.nonNull(education.getAggregate()) && !"".equalsIgnoreCase(education.getAggregate()))
		{
			edudata.setAggregate(education.getAggregate());
		}
		
		return educaterepo.save(edudata);
	}

	@Override
	public void deleteEducataionDetails(Integer eid) {
		educaterepo.deleteById(eid);
		
	}

	@Override
	public EmploymentHistory updateEmploymentHistoryDetails(Integer hid, EmploymentHistory history) {
		EmploymentHistory historydata=emphistrepo.findById(hid).get();
		
		if(Objects.nonNull(history.getCompanyName()) && !"".equalsIgnoreCase(history.getCompanyName()))
		{
			historydata.setCompanyName(history.getCompanyName());
		}
		if(Objects.nonNull(history.getSalary()) && !"".equalsIgnoreCase(history.getSalary()))
		{
			historydata.setSalary(history.getSalary());
		}
		
		return emphistrepo.save(historydata);
	}

	@Override
	public void deleteEmploymentHistory(Integer hid) {
		emphistrepo.deleteById(hid);
		
	}

	@Override
	public Certification updateCertificateDetails(Integer certificateId, Certification certification) {
		Certification certidata=certirepo.findById(certificateId).get();
		
		if(Objects.nonNull(certification.getCourseName()) && !"".equalsIgnoreCase(certification.getCourseName()))
		{
			certidata.setCourseName(certification.getCourseName());
		}
		
		if(Objects.nonNull(certification.getCourseCompletionYear()) && !"".equalsIgnoreCase(certification.getCourseCompletionYear()))
		{
			certidata.setCourseCompletionYear(certification.getCourseCompletionYear());
		}
		
		if(Objects.nonNull(certification.getInstituteName()) && !"".equalsIgnoreCase(certification.getInstituteName()))
		{
			certidata.setInstituteName(certification.getInstituteName());
		}
		
		
		return certirepo.save(certidata);
	}

	@Override
	public void deleteCertificateDetails(Integer certificateId) {
		certirepo.deleteById(certificateId);
		
	}



	
	

	
	
	

	
	
	

	
	
	

	
}
