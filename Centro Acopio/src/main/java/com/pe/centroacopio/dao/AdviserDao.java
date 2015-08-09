package com.pe.centroacopio.dao;

import java.util.List;

import com.pe.centroacopio.model.AdviserDTO;

public interface AdviserDao {
	
	public AdviserDTO getUserYambal(AdviserDTO adviser);
	public List getAllAdviser();
	 public void addAdviser(AdviserDTO adviser);

	

}
