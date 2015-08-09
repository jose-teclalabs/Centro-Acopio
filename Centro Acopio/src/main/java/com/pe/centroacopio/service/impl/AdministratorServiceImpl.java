package com.pe.centroacopio.service.impl;

import com.pe.centroacopio.dao.AdministratorDao;
import com.pe.centroacopio.pojo.Administrator;
import com.pe.centroacopio.service.AdministratorService;

public class AdministratorServiceImpl implements AdministratorService {

	AdministratorDao administratorDao;

	@Override
	public Administrator loginYanbal(String username , String clave) {
		try{			
			System.out.println(" ESTOY EN EL SERVICE " + username + clave );
		
			return  getAdministratorDao().loginAdministrator(username, clave);		
		}			
		catch(Exception e){
			return null;
		}
	}

	public AdministratorDao getAdministratorDao() {
		return administratorDao;
	}

	public void setAdministratorDao(AdministratorDao administratorDao) {
		this.administratorDao = administratorDao;
	}	
}
