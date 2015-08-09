package com.pe.centroacopio.dao;

import java.util.List;

import com.pe.centroacopio.model.ApplicationDTO;
import com.pe.centroacopio.pojo.Application;

public interface ApplicationDao {
	
	public List getAllApplication();
	public void addApplication (ApplicationDTO appl);
	public Application buscarPorIdApplication(ApplicationDTO appl);
	public void actualizarApplication(ApplicationDTO appl);
	public void eliminarApplication(ApplicationDTO appl);
	public List getFilterAppplication();

}
