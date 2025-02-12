package com.javaweb.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;


@Entity
@Table(name = "rentarea")
public class RentAreaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "value")	
	private String value;
	
	@ManyToOne
	@JoinColumn(name = "buildingid")
	private BuildingEntity buildingX;
	
	public BuildingEntity getBuildingX() {
		return buildingX;
	}
	public void setBuildingX(BuildingEntity buildingX) {
		this.buildingX = buildingX;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
//	public Long getBuildingId() {
//		return buildingId;
//	}
//	public void setBuildingId(Long buildingId) {
//		this.buildingId = buildingId;
//	}
}
