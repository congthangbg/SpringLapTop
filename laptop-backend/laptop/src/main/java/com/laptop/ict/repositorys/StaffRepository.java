package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptop.ict.models.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
