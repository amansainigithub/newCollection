package com.spring.objectCollectionMap;

import java.util.Map;

public class House {
	
	private int id;
	
	private String houseName;
	
	private Map<Address,Owner> mapData;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public Map<Address, Owner> getMapData() {
		return mapData;
	}

	public void setMapData(Map<Address, Owner> mapData) {
		this.mapData = mapData;
	}

	
	
	
	

}
