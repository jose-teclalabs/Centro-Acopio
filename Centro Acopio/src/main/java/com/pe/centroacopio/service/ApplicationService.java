package com.pe.centroacopio.service;

import java.util.List;

import com.pe.centroacopio.pojo.Application;
public interface ApplicationService {
	
	public List getAllApplication() ;
	public void addApplication (Application appl);
	public Application buscarPorIdApplication(Application appl);
	public void actualizarApplication(Application appl);
	public void eliminarApplication(Application appl);

}
