package com.pe.centroacopio.dao;

import java.util.List;

import com.pe.centroacopio.model.ProductApplicationDTO;
import com.pe.centroacopio.model.ProductDTO;
import com.pe.centroacopio.pojo.ProductApplication;

public interface ProductApplicationDao {
	
	public List getAllProductApllications(ProductDTO pro);
	public void addProductApplication(ProductApplicationDTO productApplication);
	public ProductApplication buscarPorIdProductApplication(ProductApplicationDTO productApplication) ;
	public void eliminarProductoApplication(ProductApplicationDTO productApplication);
	public List getAllTipsAndApplications ();
	public void addProductoAndTip(ProductApplicationDTO productApplication);

}
