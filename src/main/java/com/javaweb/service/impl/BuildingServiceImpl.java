package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.converter.BuildingDTOConverter;
import com.javaweb.model.BuildingDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.RentAreaRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.repository.entity.RentAreaEntity;
import com.javaweb.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService {
	@Autowired
	private BuildingRepository buildingRepository;
	
	
	
	@Autowired
	private BuildingDTOConverter buildingDTOConverter;
	
	@Override
	public List<BuildingDTO> findAll(Map<String, Object> params, List<String> typeCode) {
		// TODO Auto-generated method stub
		List<BuildingEntity> buildingEntitites = buildingRepository.findAll(params, typeCode);
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		for(BuildingEntity item : buildingEntitites) {
			BuildingDTO building = buildingDTOConverter.toBuildingDTO(item);
			
			result.add(building);
		}
		return result;
	}

}
