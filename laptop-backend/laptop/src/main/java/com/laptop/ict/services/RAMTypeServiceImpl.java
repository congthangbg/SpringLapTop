package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.laptop.ict.models.RAMType;
import com.laptop.ict.repositorys.RAMTypeRepository;


@Service
public class RAMTypeServiceImpl implements RAMTypeService {
	
	@Autowired
	RAMTypeRepository ramTypeRepository;
	
	@Override
	public RAMType save(RAMType entity) {
		return ramTypeRepository.save(entity);
	}

	@Override
	public <S extends RAMType> Optional<S> findOne(Example<S> example) {
		return ramTypeRepository.findOne(example);
	}

	@Override
	public Page<RAMType> findAll(Pageable pageable) {
		return ramTypeRepository.findAll(pageable);
	}

	@Override
	public List<RAMType> findAll() {
		return ramTypeRepository.findAll();
	}

	@Override
	public List<RAMType> findAll(Sort sort) {
		return ramTypeRepository.findAll(sort);
	}

	@Override
	public List<RAMType> findAllById(Iterable<Integer> ids) {
		return ramTypeRepository.findAllById(ids);
	}

	@Override
	public <S extends RAMType> List<S> saveAll(Iterable<S> entities) {
		return ramTypeRepository.saveAll(entities);
	}

	@Override
	public Optional<RAMType> findById(Integer id) {
		return ramTypeRepository.findById(id);
	}

	@Override
	public void flush() {
		ramTypeRepository.flush();
	}

	@Override
	public <S extends RAMType> S saveAndFlush(S entity) {
		return ramTypeRepository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Integer id) {
		return ramTypeRepository.existsById(id);
	}

	@Override
	public void deleteInBatch(Iterable<RAMType> entities) {
		ramTypeRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends RAMType> Page<S> findAll(Example<S> example, Pageable pageable) {
		return ramTypeRepository.findAll(example, pageable);
	}

	@Override
	public void deleteAllInBatch() {
		ramTypeRepository.deleteAllInBatch();
	}

	@Override
	public RAMType getOne(Integer id) {
		return ramTypeRepository.getOne(id);
	}

	@Override
	public <S extends RAMType> long count(Example<S> example) {
		return ramTypeRepository.count(example);
	}

	@Override
	public <S extends RAMType> boolean exists(Example<S> example) {
		return ramTypeRepository.exists(example);
	}

	@Override
	public <S extends RAMType> List<S> findAll(Example<S> example) {
		return ramTypeRepository.findAll(example);
	}

	@Override
	public long count() {
		return ramTypeRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		ramTypeRepository.deleteById(id);
	}

	@Override
	public <S extends RAMType> List<S> findAll(Example<S> example, Sort sort) {
		return ramTypeRepository.findAll(example, sort);
	}

	@Override
	public void delete(RAMType entity) {
		ramTypeRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends RAMType> entities) {
		ramTypeRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		ramTypeRepository.deleteAll();
	}
	
	

}
