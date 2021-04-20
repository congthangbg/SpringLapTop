package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.laptop.ict.models.LaptopDetail;
import com.laptop.ict.repositorys.LaptopDetailRepository;


@Service
public class LaptopDetailServiceImpl implements LaptopDetailService {
		
	@Autowired
	LaptopDetailRepository laptopDetailRepository;
	
	@Override
	public LaptopDetail save(LaptopDetail entity) {
		return laptopDetailRepository.save(entity);
	}

	@Override
	public <S extends LaptopDetail> Optional<S> findOne(Example<S> example) {
		return laptopDetailRepository.findOne(example);
	}

	@Override
	public Page<LaptopDetail> findAll(Pageable pageable) {
		return laptopDetailRepository.findAll(pageable);
	}

	@Override
	public List<LaptopDetail> findAll() {
		return laptopDetailRepository.findAll();
	}

	@Override
	public List<LaptopDetail> findAll(Sort sort) {
		return laptopDetailRepository.findAll(sort);
	}

	@Override
	public List<LaptopDetail> findAllById(Iterable<Integer> ids) {
		return laptopDetailRepository.findAllById(ids);
	}

	@Override
	public <S extends LaptopDetail> List<S> saveAll(Iterable<S> entities) {
		return laptopDetailRepository.saveAll(entities);
	}

	@Override
	public Optional<LaptopDetail> findById(Integer id) {
		return laptopDetailRepository.findById(id);
	}

	@Override
	public void flush() {
		laptopDetailRepository.flush();
	}

	@Override
	public <S extends LaptopDetail> S saveAndFlush(S entity) {
		return laptopDetailRepository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Integer id) {
		return laptopDetailRepository.existsById(id);
	}

	@Override
	public void deleteInBatch(Iterable<LaptopDetail> entities) {
		laptopDetailRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends LaptopDetail> Page<S> findAll(Example<S> example, Pageable pageable) {
		return laptopDetailRepository.findAll(example, pageable);
	}

	@Override
	public void deleteAllInBatch() {
		laptopDetailRepository.deleteAllInBatch();
	}

	@Override
	public LaptopDetail getOne(Integer id) {
		return laptopDetailRepository.getOne(id);
	}

	@Override
	public <S extends LaptopDetail> long count(Example<S> example) {
		return laptopDetailRepository.count(example);
	}

	@Override
	public <S extends LaptopDetail> boolean exists(Example<S> example) {
		return laptopDetailRepository.exists(example);
	}

	@Override
	public <S extends LaptopDetail> List<S> findAll(Example<S> example) {
		return laptopDetailRepository.findAll(example);
	}

	@Override
	public long count() {
		return laptopDetailRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		laptopDetailRepository.deleteById(id);
	}

	@Override
	public <S extends LaptopDetail> List<S> findAll(Example<S> example, Sort sort) {
		return laptopDetailRepository.findAll(example, sort);
	}

	@Override
	public void delete(LaptopDetail entity) {
		laptopDetailRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends LaptopDetail> entities) {
		laptopDetailRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		laptopDetailRepository.deleteAll();
	}
	
	
	
}
