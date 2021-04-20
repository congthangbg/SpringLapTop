package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.laptop.ict.models.Type;
import com.laptop.ict.repositorys.TypeRepository;

public interface TypeService {

	void deleteAll();

	void deleteAll(Iterable<? extends Type> entities);

	void delete(Type entity);

	<S extends Type> List<S> findAll(Example<S> example, Sort sort);

	void deleteById(Integer id);

	long count();

	<S extends Type> List<S> findAll(Example<S> example);

	<S extends Type> boolean exists(Example<S> example);

	<S extends Type> long count(Example<S> example);

	Type getOne(Integer id);

	void deleteAllInBatch();

	<S extends Type> Page<S> findAll(Example<S> example, Pageable pageable);

	void deleteInBatch(Iterable<Type> entities);

	boolean existsById(Integer id);

	<S extends Type> S saveAndFlush(S entity);

	void flush();

	Optional<Type> findById(Integer id);

	<S extends Type> List<S> saveAll(Iterable<S> entities);

	List<Type> findAllById(Iterable<Integer> ids);

	List<Type> findAll(Sort sort);

	List<Type> findAll();

	Page<Type> findAll(Pageable pageable);

	<S extends Type> Optional<S> findOne(Example<S> example);

	Type save(Type entity);


}
