package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.laptop.ict.models.LaptopDetail;
import com.laptop.ict.repositorys.LaptopDetailRepository;

public interface LaptopDetailService {

	void deleteAll();

	void deleteAll(Iterable<? extends LaptopDetail> entities);

	void delete(LaptopDetail entity);

	<S extends LaptopDetail> List<S> findAll(Example<S> example, Sort sort);

	void deleteById(Integer id);

	long count();

	<S extends LaptopDetail> List<S> findAll(Example<S> example);

	<S extends LaptopDetail> boolean exists(Example<S> example);

	<S extends LaptopDetail> long count(Example<S> example);

	LaptopDetail getOne(Integer id);

	void deleteAllInBatch();

	<S extends LaptopDetail> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<LaptopDetail> entities);

	boolean existsById(Integer id);

	<S extends LaptopDetail> S saveAndFlush(S entity);

	void flush();

	Optional<LaptopDetail> findById(Integer id);

	<S extends LaptopDetail> List<S> saveAll(Iterable<S> entities);

	List<LaptopDetail> findAllById(Iterable<Integer> ids);

	List<LaptopDetail> findAll(Sort sort);

	List<LaptopDetail> findAll();

	Page<LaptopDetail> findAll(Pageable pageable);

	<S extends LaptopDetail> Optional<S> findOne(Example<S> example);

	<S extends LaptopDetail> S save(S entity);

}
