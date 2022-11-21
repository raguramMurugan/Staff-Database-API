package com.college.staffDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.staffDetails.entity.BloodGroup;

@Repository
public interface BloodGroupRepo extends JpaRepository<BloodGroup, Integer> {

}
