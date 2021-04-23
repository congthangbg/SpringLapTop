package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.laptop.ict.models.Brand;
import com.laptop.ict.repositorys.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService{
	@Autowired
	BrandRepository brandRepository;
	
	@Override
	public Brand save(Brand entity) {
		return brandRepository.save(entity);
	}

	@Override
	public <S extends Brand> Optional<S> findOne(Example<S> example) {
		return brandRepository.findOne(example);
	}

	@Override
	public Page<Brand> findAll(Pageable pageable) {
		return brandRepository.findAll(pageable);
	}

	@Override
	public List<Brand> findAll() {
		return brandRepository.findAll();
	}

	@Override
	public List<Brand> findAll(Sort sort) {
		return brandRepository.findAll(sort);
	}

	@Override
	public List<Brand> findAllById(Iterable<Integer> ids) {
		return brandRepository.findAllById(ids);
	}

	@Override
	public <S extends Brand> List<S> saveAll(Iterable<S> entities) {
		return brandRepository.saveAll(entities);
	}

	@Override
	public Optional<Brand> findById(Integer id) {
		return brandRepository.findById(id);
	}

	@Override
	public void flush() {
		brandRepository.flush();
	}

	@Override
	public <S extends Brand> S saveAndFlush(S entity) {
		return brandRepository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Integer id) {
		return brandRepository.existsById(id);
	}

	@Override
	public void deleteInBatch(Iterable<Brand> entities) {
		brandRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends Brand> Page<S> findAll(Example<S> example, Pageable pageable) {
		return brandRepository.findAll(example, pageable);
	}

	@Override
	public void deleteAllInBatch() {
		brandRepository.deleteAllInBatch();
	}

	@Override
	public Brand getOne(Integer id) {
		return brandRepository.getOne(id);
	}

	@Override
	public <S extends Brand> long count(Example<S> example) {
		return brandRepository.count(example);
	}

	@Override
	public <S extends Brand> boolean exists(Example<S> example) {
		return brandRepository.exists(example);
	}

	@Override
	public <S extends Brand> List<S> findAll(Example<S> example) {
		return brandRepository.findAll(example);
	}

	@Override
	public long count() {
		return brandRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		brandRepository.deleteById(id);
	}

	@Override
	public <S extends Brand> List<S> findAll(Example<S> example, Sort sort) {
		return brandRepository.findAll(example, sort);
	}

	@Override
	public void delete(Brand entity) {
		brandRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Brand> entities) {
		brandRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		brandRepository.deleteAll();
	}
	
	
}
