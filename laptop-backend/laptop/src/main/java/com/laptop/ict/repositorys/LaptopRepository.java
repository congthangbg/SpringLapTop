package com.laptop.ict.repositorys;


import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.laptop.ict.models.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

		@Query("SELECT e FROM Laptop e")
		Page<Laptop> findPageLaptop(org.springframework.data.domain.Pageable pageable);

}
