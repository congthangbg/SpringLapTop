package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.laptop.ict.models.Laptop;
import com.laptop.ict.repositorys.LaptopRepository;

public interface LaptopService {

	void deleteAll();

	void deleteAll(Iterable<? extends Laptop> entities);

	void delete(Laptop entity);

	<S extends Laptop> List<S> findAll(Example<S> example, Sort sort);

	void deleteById(Integer id);

	long count();

	<S extends Laptop> List<S> findAll(Example<S> example);

	<S extends Laptop> boolean exists(Example<S> example);

	<S extends Laptop> long count(Example<S> example);

	Laptop getOne(Integer id);

	void deleteAllInBatch();

	<S extends Laptop> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<Laptop> entities);

	boolean existsById(Integer id);

	<S extends Laptop> S saveAndFlush(S entity);

	void flush();

	Optional<Laptop> findById(Integer id);

	List<Laptop> saveAll(List<Laptop> laptop);

	List<Laptop> findAllById(Iterable<Integer> ids);

	List<Laptop> findAll(Sort sort);

	List<Laptop> findAll();

	Page<Laptop> findAll(Pageable pageable);

	<S extends Laptop> Optional<S> findOne(Example<S> example);

	Laptop save(Laptop entity);

	Page<Laptop> findPageLaptop(Pageable pageable);


}
