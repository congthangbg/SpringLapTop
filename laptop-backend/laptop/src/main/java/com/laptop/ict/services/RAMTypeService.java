package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.laptop.ict.models.RAMType;
import com.laptop.ict.repositorys.RAMTypeRepository;

public interface RAMTypeService {

	void deleteAll();

	void deleteAll(Iterable<? extends RAMType> entities);

	void delete(RAMType entity);

	<S extends RAMType> List<S> findAll(Example<S> example, Sort sort);

	void deleteById(Integer id);

	long count();

	<S extends RAMType> List<S> findAll(Example<S> example);

	<S extends RAMType> boolean exists(Example<S> example);

	<S extends RAMType> long count(Example<S> example);

	RAMType getOne(Integer id);

	void deleteAllInBatch();

	<S extends RAMType> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<RAMType> entities);

	boolean existsById(Integer id);

	<S extends RAMType> S saveAndFlush(S entity);

	void flush();

	Optional<RAMType> findById(Integer id);

	<S extends RAMType> List<S> saveAll(Iterable<S> entities);

	List<RAMType> findAllById(Iterable<Integer> ids);

	List<RAMType> findAll(Sort sort);

	List<RAMType> findAll();

	Page<RAMType> findAll(Pageable pageable);

	<S extends RAMType> Optional<S> findOne(Example<S> example);

	RAMType save(RAMType entity);

}
