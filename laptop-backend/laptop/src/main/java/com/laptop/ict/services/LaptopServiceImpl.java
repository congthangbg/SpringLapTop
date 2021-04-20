package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.laptop.ict.models.Laptop;
import com.laptop.ict.repositorys.LaptopRepository;

@Service
public class LaptopServiceImpl implements LaptopService{
	@Autowired
	LaptopRepository laptopRepository;

	
	@Override
	public Laptop save(Laptop entity) {
		return laptopRepository.save(entity);
	}

	@Override
	public <S extends Laptop> Optional<S> findOne(Example<S> example) {
		return laptopRepository.findOne(example);
	}

	@Override
	public Page<Laptop> findAll(Pageable pageable) {
		return laptopRepository.findAll(pageable);
	}

	@Override
	public List<Laptop> findAll() {
		return laptopRepository.findAll();
	}

	@Override
	public List<Laptop> findAll(Sort sort) {
		return laptopRepository.findAll(sort);
	}

	@Override
	public List<Laptop> findAllById(Iterable<Integer> ids) {
		return laptopRepository.findAllById(ids);
	}

	@Override
	public List<Laptop> saveAll(List<Laptop> laptop) {
		return laptopRepository.saveAll(laptop);
	}

	@Override
	public Optional<Laptop> findById(Integer id) {
		return laptopRepository.findById(id);
	}

	@Override
	public void flush() {
		laptopRepository.flush();
	}

	@Override
	public <S extends Laptop> S saveAndFlush(S entity) {
		return laptopRepository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Integer id) {
		return laptopRepository.existsById(id);
	}

	@Override
	public void deleteInBatch(Iterable<Laptop> entities) {
		laptopRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends Laptop> Page<S> findAll(Example<S> example, Pageable pageable) {
		return laptopRepository.findAll(example, pageable);
	}

	@Override
	public void deleteAllInBatch() {
		laptopRepository.deleteAllInBatch();
	}

	@Override
	public Laptop getOne(Integer id) {
		return laptopRepository.getOne(id);
	}

	@Override
	public <S extends Laptop> long count(Example<S> example) {
		return laptopRepository.count(example);
	}

	@Override
	public <S extends Laptop> boolean exists(Example<S> example) {
		return laptopRepository.exists(example);
	}

	@Override
	public <S extends Laptop> List<S> findAll(Example<S> example) {
		return laptopRepository.findAll(example);
	}

	@Override
	public long count() {
		return laptopRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		laptopRepository.deleteById(id);
	}

	@Override
	public <S extends Laptop> List<S> findAll(Example<S> example, Sort sort) {
		return laptopRepository.findAll(example, sort);
	}

	@Override
	public void delete(Laptop entity) {
		laptopRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Laptop> entities) {
		laptopRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		laptopRepository.deleteAll();
	}

	@Override
	public Page<Laptop> findPageLaptop(
			org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable pageable) {
		return laptopRepository.findPageLaptop((Pageable) pageable);
	}



}
