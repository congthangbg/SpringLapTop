package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.laptop.ict.models.Brand;


public interface BrandService {

	void deleteAll();

	void deleteAll(Iterable<? extends Brand> entities);

	void delete(Brand entity);

	<S extends Brand> List<S> findAll(Example<S> example, Sort sort);

	void deleteById(Integer id);

	long count();

	<S extends Brand> List<S> findAll(Example<S> example);

	<S extends Brand> boolean exists(Example<S> example);

	<S extends Brand> long count(Example<S> example);

	Brand getOne(Integer id);

	void deleteAllInBatch();

	<S extends Brand> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<Brand> entities);

	boolean existsById(Integer id);

	<S extends Brand> S saveAndFlush(S entity);

	void flush();

	Optional<Brand> findById(Integer id);

	<S extends Brand> List<S> saveAll(Iterable<S> entities);

	List<Brand> findAllById(Iterable<Integer> ids);

	List<Brand> findAll(Sort sort);

	List<Brand> findAll();

	Page<Brand> findAll(Pageable pageable);

	<S extends Brand> Optional<S> findOne(Example<S> example);

	Brand save(Brand entity);



}
