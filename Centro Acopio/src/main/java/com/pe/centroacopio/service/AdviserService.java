package com.pe.centroacopio.service;

import java.util.List;

import com.pe.centroacopio.model.AdviserDTO;

public interface AdviserService {
//	public AdviserDTO yanbalLogin (AdviserDTO adviser);
	public void saveAdviser(AdviserDTO adviser);
	 public List getAllAdviser();

}
