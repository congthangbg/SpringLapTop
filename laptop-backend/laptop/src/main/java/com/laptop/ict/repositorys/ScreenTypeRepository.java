package com.laptop.ict.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.ict.models.ScreenType;

@Repository
public interface ScreenTypeRepository extends JpaRepository<ScreenType, Integer> {

}
