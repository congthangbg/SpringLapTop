package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.laptop.ict.models.Type;
import com.laptop.ict.repositorys.TypeRepository;


@Service
public class TypeServiceImpl implements TypeService {
	
	@Autowired
	TypeRepository typeRepository;
	
	@Override
	public Type save(Type entity) {
		return typeRepository.save(entity);
	}

	@Override
	public <S extends Type> Optional<S> findOne(Example<S> example) {
		return typeRepository.findOne(example);
	}

	@Override
	public Page<Type> findAll(Pageable pageable) {
		return typeRepository.findAll(pageable);
	}

	@Override
	public List<Type> findAll() {
		return typeRepository.findAll();
	}

	@Override
	public List<Type> findAll(Sort sort) {
		return typeRepository.findAll(sort);
	}

	@Override
	public List<Type> findAllById(Iterable<Integer> ids) {
		return typeRepository.findAllById(ids);
	}

	@Override
	public <S extends Type> List<S> saveAll(Iterable<S> entities) {
		return typeRepository.saveAll(entities);
	}

	@Override
	public Optional<Type> findById(Integer id) {
		return typeRepository.findById(id);
	}

	@Override
	public void flush() {
		typeRepository.flush();
	}

	@Override
	public <S extends Type> S saveAndFlush(S entity) {
		return typeRepository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Integer id) {
		return typeRepository.existsById(id);
	}

	@Override
	public void deleteInBatch(Iterable<Type> entities) {
		typeRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends Type> Page<S> findAll(Example<S> example, Pageable pageable) {
		return typeRepository.findAll(example, pageable);
	}

	@Override
	public void deleteAllInBatch() {
		typeRepository.deleteAllInBatch();
	}

	@Override
	public Type getOne(Integer id) {
		return typeRepository.getOne(id);
	}

	@Override
	public <S extends Type> long count(Example<S> example) {
		return typeRepository.count(example);
	}

	@Override
	public <S extends Type> boolean exists(Example<S> example) {
		return typeRepository.exists(example);
	}

	@Override
	public <S extends Type> List<S> findAll(Example<S> example) {
		return typeRepository.findAll(example);
	}

	@Override
	public long count() {
		return typeRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		typeRepository.deleteById(id);
	}

	@Override
	public <S extends Type> List<S> findAll(Example<S> example, Sort sort) {
		return typeRepository.findAll(example, sort);
	}

	@Override
	public void delete(Type entity) {
		typeRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Type> entities) {
		typeRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		typeRepository.deleteAll();
	}
	
	
	
}
