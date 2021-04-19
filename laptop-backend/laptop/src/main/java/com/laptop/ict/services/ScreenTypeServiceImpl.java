package com.laptop.ict.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.laptop.ict.models.ScreenType;
import com.laptop.ict.repositorys.ScreenTypeRepository;


@Service
public class ScreenTypeServiceImpl implements ScreenTypeService {
	
	@Autowired
	ScreenTypeRepository screenTypeRepository;
	
	@Override
	public ScreenType save(ScreenType entity) {
		return screenTypeRepository.save(entity);
	}

	@Override
	public <S extends ScreenType> Optional<S> findOne(Example<S> example) {
		return screenTypeRepository.findOne(example);
	}

	@Override
	public Page<ScreenType> findAll(Pageable pageable) {
		return screenTypeRepository.findAll(pageable);
	}

	@Override
	public List<ScreenType> findAll() {
		return screenTypeRepository.findAll();
	}

	@Override
	public List<ScreenType> findAll(Sort sort) {
		return screenTypeRepository.findAll(sort);
	}

	@Override
	public List<ScreenType> findAllById(Iterable<Integer> ids) {
		return screenTypeRepository.findAllById(ids);
	}

	@Override
	public <S extends ScreenType> List<S> saveAll(Iterable<S> entities) {
		return screenTypeRepository.saveAll(entities);
	}

	@Override
	public Optional<ScreenType> findById(Integer id) {
		return screenTypeRepository.findById(id);
	}

	@Override
	public void flush() {
		screenTypeRepository.flush();
	}

	@Override
	public <S extends ScreenType> S saveAndFlush(S entity) {
		return screenTypeRepository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Integer id) {
		return screenTypeRepository.existsById(id);
	}

	@Override
	public void deleteInBatch(Iterable<ScreenType> entities) {
		screenTypeRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends ScreenType> Page<S> findAll(Example<S> example, Pageable pageable) {
		return screenTypeRepository.findAll(example, pageable);
	}

	@Override
	public void deleteAllInBatch() {
		screenTypeRepository.deleteAllInBatch();
	}

	@Override
	public ScreenType getOne(Integer id) {
		return screenTypeRepository.getOne(id);
	}

	@Override
	public <S extends ScreenType> long count(Example<S> example) {
		return screenTypeRepository.count(example);
	}

	@Override
	public <S extends ScreenType> boolean exists(Example<S> example) {
		return screenTypeRepository.exists(example);
	}

	@Override
	public <S extends ScreenType> List<S> findAll(Example<S> example) {
		return screenTypeRepository.findAll(example);
	}

	@Override
	public long count() {
		return screenTypeRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		screenTypeRepository.deleteById(id);
	}

	@Override
	public <S extends ScreenType> List<S> findAll(Example<S> example, Sort sort) {
		return screenTypeRepository.findAll(example, sort);
	}

	@Override
	public void delete(ScreenType entity) {
		screenTypeRepository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends ScreenType> entities) {
		screenTypeRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		screenTypeRepository.deleteAll();
	}
	
	
	
	
}
