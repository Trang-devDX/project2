package com.javaweb.repository.custom.impl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.custom.BuildingRepositoryCustom;
import com.javaweb.repository.entity.BuildingEntity;
@Repository
@Primary
public class BuildingRepositoryImpl implements BuildingRepositoryCustom {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<BuildingEntity> findAll(Map<String, Object> params, List<String> typeCode) {
		// TODO Auto-generated method stub
//		JPQL: JPA Query L
//		String sql = "FROM BuildingEntity b WHERE b.id = 1 ";
//		Query query = entityManager.createNamedQuery(sql, BuildingEntity.class);
		
//		SQL Native
		String sql = "SELECT * FROM building b WHERE b.name LIKE '%%'";
		Query query = (Query) entityManager.createNativeQuery(sql, BuildingEntity.class);
		return query.getResultList();
	}
}
