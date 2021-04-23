package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.laptop.ict.models.ScreenType;
import com.laptop.ict.repositorys.ScreenTypeRepository;


public interface ScreenTypeService {
	
	void deleteAll();

	void deleteAll(Iterable<? extends ScreenType> entities);

	void delete(ScreenType entity);

	<S extends ScreenType> List<S> findAll(Example<S> example, Sort sort);

	void deleteById(Integer id);

	long count();

	<S extends ScreenType> List<S> findAll(Example<S> example);

	<S extends ScreenType> boolean exists(Example<S> example);

	<S extends ScreenType> long count(Example<S> example);

	ScreenType getOne(Integer id);

	void deleteAllInBatch();

	<S extends ScreenType> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<ScreenType> entities);

	boolean existsById(Integer id);

	<S extends ScreenType> S saveAndFlush(S entity);

	void flush();

	Optional<ScreenType> findById(Integer id);

	<S extends ScreenType> List<S> saveAll(Iterable<S> entities);

	List<ScreenType> findAllById(Iterable<Integer> ids);

	List<ScreenType> findAll(Sort sort);

	List<ScreenType> findAll();

	Page<ScreenType> findAll(Pageable pageable);

	<S extends ScreenType> Optional<S> findOne(Example<S> example);

	ScreenType save(ScreenType entity);

}
