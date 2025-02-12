package com.javaweb.repository.custom;

import java.util.List;
import java.util.Map;

import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingRepositoryCustom {

	List<BuildingEntity> findAll(Map<String, Object> params, List<String> typeCode);

}
