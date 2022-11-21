package com.college.staffDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.staffDetails.entity.Designation;

@Repository
public interface DesignationRepo extends JpaRepository<Designation, Integer> {

}
